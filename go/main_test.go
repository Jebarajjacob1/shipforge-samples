package main

import (
	"io"
	"net/http/httptest"
	"testing"
)

func TestHelloAndHealth(t *testing.T) {
	srv := httptest.NewServer(handler())
	defer srv.Close()
	for path, want := range map[string]string{"/": "Hello from ShipForge (Go)\n", "/health": "ok\n"} {
		res, err := srv.Client().Get(srv.URL + path)
		if err != nil {
			t.Fatal(err)
		}
		body, _ := io.ReadAll(res.Body)
		res.Body.Close()
		if string(body) != want {
			t.Errorf("%s = %q, want %q", path, body, want)
		}
	}
}
