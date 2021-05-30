# VocaDB OpenAPI Java Client Autofixer

Autofix for VocaDB API Java Client generated by OpenAPI

## How to use

### 0. I don't want to generate my own client, I want your already-generated-and-fixed client

Just go to my sample [VocaDB OpenAPI Java Client](https://github.com/CXwudi/vocadb-openapi-client-java), and no need to read the rest of this doc 😁

### 1. Generate the raw client

1. install OpenAPI (see [instruction](https://github.com/OpenAPITools/openapi-generator#1---installation))
2. grab the `swagger.json` from VocaDB API [page](https://vocadb.net/swagger/index.html)
3. open bash and run these command
```
openapi-generator-cli generate \
--api-package <your package>.api \
--model-package <your package>.model \
--invoker-package <your package>.client \
-i <location of the`swagger.json file> \
--group-id <your group-id> \
--artifact-id <your artifact-id> \
--artifact-version <your version> \
-g java  \
  -p java8=true \
  -p dateLibrary=java8-localdatetime \
  -p useRuntimeException=true \
  -p openApiNullable=false \
  -p serializationLibrary=jackson \
--library <any candidates other than okhttp-gson> \
-o <give a name to your client directory>
```

- available library candidates are specified in OpenAPI Java [page](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md)

4. (if using `resttemplate` or `webclient`) resolve import conflict in `UserApiApi.java`
   1. remove `import <your package>.model.MediaType;`
   2. let `apiUsersCurrentAlbumsAlbumIdPost()` and `apiUsersCurrentAlbumsAlbumIdPostWithHttpInfo()` take the parameter of type `<your package>.model.MediaType`
5. (Optional) update some of the dependencies used by the client


### 2. Fix the generated client with this auto fixer

1. clone this project `git clone --recurse-submodules -j8 https://github.com/CXwudi/vocadb-openapi-java-client-autofixer`
2. open the [my-config.yml](./vocadb-apiclient-fixer/my-config.yml) file in [`./vocadb-apiclient-fixer`](vocadb-apiclient-fixer/) and edit it
   1. input directory is where your auto-generated client is
      - can be relative path from the [`./vocadb-apiclient-fixer`](vocadb-apiclient-fixer/) perspective
   2. relative path to model is the relative path from theinput directory to path of `--model-package` on your `openapi-generator-cli` command
3. cd into [`./vocadb-apiclient-fixer`](vocadb-apiclient-fixer/), run `./mvnw spring-boot:run '-Dspring-boot.run.arguments="--spring.config.import=file:my-config.yml"'`
4. your client should be ready to use 😉

## Notes

### Before generate

- OpenAPI is very fragile, so better stick with the command in the step to generate your client
- Gson is not working for parsing date, like `Expected BEGIN_OBJECT but was STRING at line 1 column 109 path $.items[0].song.createDate`
- when using Jackson, must put `-p openApiNullable=false`, otherwise parsing issue on list with `com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize instance of 'org.openapitools.jackson.nullable.JsonNullable<java.util.List<cx.mikufan.vocadbapiclient.model.SongInListForApiContract>>' out of START_ARRAY token`. This is because with `openApiNullable=true`, your list is `JsonNullable<List<>>` instead of `List<>`
- as for data library, use `java8-localdatetime`
  - the default one `threetenbp` has parsing issue
  - the `java-8` one use `ZoneDateTime` which requires an additional zone info in the string, but vocadb's date doesn't have it
- modify the [my-config.yml](./vocadb-apiclient-fixer/my-config.yml) to set to your generated client and spcify your own output folder
  - the [my-config.yml](./vocadb-apiclient-fixer/my-config.yml) file has a default config value filled in. It can autofix the [sample-unfixed-client](./sample-unfixed-client) for demo purposes.
  - In fact, the sample [VocaDB OpenAPI Java Client](https://github.com/CXwudi/vocadb-openapi-client-java) is fixed by this demo config

### When using the client

- take a look of your client, understand the structure
  - api directory is where you use to call the VocaDB Rest API
  - `ApiClient` is the core class
- by default, the base URL is always `http://localhost`, change it to `https://vocadb.net` by calling `setBaseurl()` on `ApiClient` class
  - for Java 11 native HTTP client, use `setHostname("vocadb.net")` and `setScheme("https")` (Java 11 native HTTP client doesn't have `setBaseurl()`). If you don't do `setScheme("https")`, you need to manually add `builder.followRedirects(Redirect.NORMAL)`
- because VocaDB and UtaiteDB use the same codebase, you could probably change the base URL to `https://utaitedb.net` to make your client an UtaiteDB Api Client.
  - be awared that some artist types are a bit different between VocaDB and UtaiteDB, as ycanardeau [said](https://discord.com/channels/309072240639737866/723937904216375317/844444328662401044)
  - if having problem on UtaiteDB, you can always grab the `swagger.json` file from UtaiteDB API [page](https://utaitedb.net/swagger/index.html) and regernate your client just for UtaiteDB

## So what does this auto fixer trying to fix

This fixer will change all enum classes with suffixname of `s` into a class that can make Jackson JSON parser parses works for one-line multiple-enum string.  
For example, take a look at the `SongForApiContract` in the sample-unfixed-client.
It has a field `private PVServices pvServices;`.
Before fixing, `PVServices` is just an enum class. It can only accept one enum for that field.  
However, in reality, VocaDB could return multiple enums for that field,
separated by comma (like `pvServers: "NicoNicoDouga, Youtube"`).

This fixer also globally replaces all strings `ApiApi` to `Api`.
If a file name contains such a string, the file is also renamed.
