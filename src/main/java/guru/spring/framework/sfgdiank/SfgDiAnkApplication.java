package guru.spring.framework.sfgdiank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.spring.framework.sfgdiank.controller.MyController;
import guru.spring.framework.sfgdiank.controller.PropertyInjectedController;

@SpringBootApplication
public class SfgDiAnkApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SfgDiAnkApplication.class, args);
		
		MyController mc=ac.getBean(MyController.class);
		
		MyController mc2=(MyController)ac.getBean("myController");
		System.out.println("Printing from object created from context "+mc.sayHello());
		
		/*
		PropertyInjectedController pic=ac.getBean(PropertyInjectedController.class);
		sysoutpic.getGreeting();*/
	}

}
