package guru.spring.framework.sfgdiank.controller;

import guru.spring.framework.sfgdiank.service.GreetingService;
import guru.spring.framework.sfgdiank.service.GreetingServiceImpl;

public class ConstructorInjectedController {

	 GreetingService greetingService;
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


}
