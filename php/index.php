<?php
// The ShipForge PHP sample, served by the PHP buildpack's web server.
header('Content-Type: text/plain');
$path = parse_url($_SERVER['REQUEST_URI'] ?? '/', PHP_URL_PATH);
if ($path === '/health') {
    echo "ok\n";
} elseif ($path === '/' || $path === '/index.php') {
    echo "Hello from ShipForge (PHP)\n";
} else {
    http_response_code(404);
    echo "not found\n";
}
