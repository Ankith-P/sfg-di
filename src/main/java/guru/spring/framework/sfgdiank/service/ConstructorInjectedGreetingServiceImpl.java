package guru.spring.framework.sfgdiank.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
//@Primary-> this component will be considered for all the interfaces implemented by GreetingService 
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "ConstructorInjectedGreetingServiceImpl:: Hello World from Greeting Service";
	}

}
