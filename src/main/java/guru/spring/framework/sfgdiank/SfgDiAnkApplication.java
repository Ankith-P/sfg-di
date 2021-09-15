package guru.spring.framework.sfgdiank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.spring.framework.sfgdiank.controller.ConstructorInjectedController;
import guru.spring.framework.sfgdiank.controller.MyController;
import guru.spring.framework.sfgdiank.controller.PropertyInjectedController;
import guru.spring.framework.sfgdiank.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiAnkApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SfgDiAnkApplication.class, args);
		
		MyController mc=ac.getBean(MyController.class);
		
		MyController mc2=(MyController)ac.getBean("myController");
		System.out.println("Printing from object created from context "+mc.sayHello());
		
		
		PropertyInjectedController pic=ac.getBean(PropertyInjectedController.class);
		System.out.println("Spring DI Property PIC "+pic.getGreeting());
		
		SetterInjectedController sic=ac.getBean(SetterInjectedController.class);
		System.out.println("Spring DI Setter SIC "+sic.getGreeting());
		
		ConstructorInjectedController cic=ac.getBean(ConstructorInjectedController.class);
		System.out.println("Spring DI Constructor CIC "+cic.getGreeting());
	}

}
