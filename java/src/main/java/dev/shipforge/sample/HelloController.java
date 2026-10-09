package dev.shipforge.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/", produces = "text/plain")
	public String hello() {
		return "Hello from ShipForge (Java)\n";
	}

	@GetMapping(value = "/health", produces = "text/plain")
	public String health() {
		return "ok\n";
	}

}
