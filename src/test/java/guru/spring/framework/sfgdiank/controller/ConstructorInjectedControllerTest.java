package guru.spring.framework.sfgdiank.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.spring.framework.sfgdiank.service.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	public ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println("Calling from constructorInjectedController "+constructorInjectedController.getGreeting());
	}

}
