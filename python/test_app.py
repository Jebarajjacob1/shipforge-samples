from app import app


def test_hello_and_health():
    client = app.test_client()
    assert client.get("/").get_data(as_text=True) == "Hello from ShipForge (Python)\n"
    assert client.get("/health").get_data(as_text=True) == "ok\n"
