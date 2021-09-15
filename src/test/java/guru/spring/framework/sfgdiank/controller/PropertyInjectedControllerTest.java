package guru.spring.framework.sfgdiank.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.spring.framework.sfgdiank.service.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;
	

	@BeforeEach
	void setUp() throws Exception {
		propertyInjectedController=new PropertyInjectedController();
		
		propertyInjectedController.greetingService=new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(propertyInjectedController.getGreeting());
	}

}
