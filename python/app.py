from flask import Flask

app = Flask(__name__)


@app.get("/")
def hello():
    return "Hello from ShipForge (Python)\n", 200, {"Content-Type": "text/plain"}


@app.get("/health")
def health():
    return "ok\n", 200, {"Content-Type": "text/plain"}
