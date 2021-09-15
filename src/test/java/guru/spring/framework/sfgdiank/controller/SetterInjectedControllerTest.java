package guru.spring.framework.sfgdiank.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import guru.spring.framework.sfgdiank.service.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController =new SetterInjectedController();
		
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println("setter injection "+setterInjectedController.getGreeting());
	}

}
