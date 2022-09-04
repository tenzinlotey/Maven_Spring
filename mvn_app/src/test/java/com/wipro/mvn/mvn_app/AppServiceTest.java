package com.wipro.mvn.mvn_app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppServiceTest {

	@Test
	void testGetLengthStr() {
		AppService obj = new AppService();
		assertEquals(6, obj.getLengthStr("Tenzin"));
	}

}
