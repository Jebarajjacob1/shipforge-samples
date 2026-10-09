const { test } = require("node:test");
const assert = require("node:assert");
const app = require("./app");

test("says hello and is healthy", async () => {
  const server = app.listen(0);
  const base = `http://127.0.0.1:${server.address().port}`;
  try {
    assert.strictEqual(await (await fetch(base + "/")).text(), "Hello from ShipForge (Node.js)\n");
    assert.strictEqual(await (await fetch(base + "/health")).text(), "ok\n");
  } finally {
    server.close();
  }
});
