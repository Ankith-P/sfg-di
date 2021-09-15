package guru.spring.framework.sfgdiank.controller;

import org.springframework.stereotype.Controller;

import guru.spring.framework.sfgdiank.service.GreetingService;

@Controller


public class MyController {
	
	
private final GreetingService greetingService;


	
	public MyController(GreetingService greetingService) {
	super();
	this.greetingService = greetingService;
}



	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

}
