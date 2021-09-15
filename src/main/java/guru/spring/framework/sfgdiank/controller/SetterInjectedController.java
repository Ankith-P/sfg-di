package guru.spring.framework.sfgdiank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.spring.framework.sfgdiank.service.GreetingService;

@Controller
public class SetterInjectedController {


	GreetingService greetingService;
	@Qualifier("setterInjectedGreetingServiceImpl")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
	
	//public String get

}
