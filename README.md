# Java Service for demo CI / CD on GitHub

Project contains a simple Spring Boot Java web service to explain CI / CD. The web service implements a simple calculator that only supports the add operation.

## Usages

Build and start the application

```bash
./gradlew bootrun
```

Once started the calculator is listening on port 8080. Test the calculator with curl on the command line or with postmen.

```bash
curl --location --request POST '' \
--data-raw '{
	"a":1,
	"b":1
}
'
```
