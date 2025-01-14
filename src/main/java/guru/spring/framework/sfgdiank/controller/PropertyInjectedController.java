package guru.spring.framework.sfgdiank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.spring.framework.sfgdiank.service.GreetingService;

@Controller

public class PropertyInjectedController {
	@Qualifier("propertyInjectedGreetingServiceImpl1")
	@Autowired
	GreetingService greetingService;
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

}
