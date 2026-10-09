package dev.shipforge.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
	void saysHelloAndIsHealthy() {
		HelloController controller = new HelloController();
		assertEquals("Hello from ShipForge (Java)\n", controller.hello());
		assertEquals("ok\n", controller.health());
	}

}
