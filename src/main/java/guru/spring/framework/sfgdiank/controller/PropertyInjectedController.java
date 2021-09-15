package guru.spring.framework.sfgdiank.controller;

import guru.spring.framework.sfgdiank.service.GreetingService;

public class PropertyInjectedController {
	
	GreetingService greetingService;
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

}
