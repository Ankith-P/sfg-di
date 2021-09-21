package guru.spring.framework.sfgdiank.service;

import org.springframework.stereotype.Service;

//@Service
public class setterInjectedGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "setterInjectedGreetingServiceImpl:: Hello World from Greeting Service";
	}

}
