package guru.spring.framework.sfgdiank.controller;

import guru.spring.framework.sfgdiank.service.GreetingService;

public class SetterInjectedController {

	GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
	
	//public String get

}
