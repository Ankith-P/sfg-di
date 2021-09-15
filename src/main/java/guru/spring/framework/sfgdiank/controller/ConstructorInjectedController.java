package guru.spring.framework.sfgdiank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.spring.framework.sfgdiank.service.GreetingService;
import guru.spring.framework.sfgdiank.service.GreetingServiceImpl;


@Controller
public class ConstructorInjectedController {

	 GreetingService greetingService;
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

	/*This option is autowired from spring 4.2*/
	//@Autowired
	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


}
