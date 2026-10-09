# ShipForge samples

One small web app per language ShipForge builds (session 7b, ADR 0020). Each one answers
`/` with `Hello from ShipForge (<language>)` and `/health` with `ok`, on the port in the
`PORT` environment variable, the way ShipForge runs apps.

| Folder | Language | Built with | Tests in Checks |
|---|---|---|---|
| node | Node.js (Express) | Buildpacks | `npm ci && npm test` |
| python | Python (Flask, gunicorn) | Buildpacks | `pytest` |
| go | Go (net/http) | Buildpacks | `go test ./...` |
| java | Java 17 (Spring Boot, Maven) | Buildpacks | `./mvnw -B test` |
| php | PHP | Buildpacks (full builder) | none yet |
| ruby | Ruby (Sinatra, Puma) | Buildpacks | none yet |
| dotnet | .NET 10 (ASP.NET Core) | Buildpacks | none yet |
| static | HTML | Buildpacks (nginx) | none |
| dockerfile | Go, in its own Dockerfile | BuildKit | none |

`make samples-publish` copies this folder to the public repository
`<your GitHub user>/shipforge-samples`; `make test-languages` deploys every folder from there
as its own application (the application's root folder is the sample's folder).
