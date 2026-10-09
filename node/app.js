const express = require("express");

const app = express();
app.get("/", (req, res) => res.type("text").send("Hello from ShipForge (Node.js)\n"));
app.get("/health", (req, res) => res.type("text").send("ok\n"));

module.exports = app;
