# The ShipForge Dockerfile sample: a Go web server built in one stage and run
# in a small image as a non-root user. Base images match deploy/local/cell/versions.env.
FROM golang:1.26.8-bookworm AS build
WORKDIR /src
COPY go.mod main.go ./
RUN CGO_ENABLED=0 go build -o /out/server .

FROM alpine:3.24.2
COPY --from=build /out/server /usr/local/bin/server
USER 65534
EXPOSE 8080
CMD ["server"]
