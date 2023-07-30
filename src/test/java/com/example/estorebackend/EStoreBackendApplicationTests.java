/*package com.example.estorebackend;

import java.net.URI;
import java.net.URL;

import javax.print.attribute.standard.MediaSize.NA;

import org.hibernate.mapping.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class EStoreBackendApplicationTests {
	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;
	@DisplayName("Test1 - Fetch Admin Accounts ")
	@Test
	void testAdminAccounts()  {
		Map response = restTemplate.getForObject(new URL("http:localhost:"+port+"adminauth/get",));
		System.out.println("Response1: "+response);
		
		
	}

}

*/