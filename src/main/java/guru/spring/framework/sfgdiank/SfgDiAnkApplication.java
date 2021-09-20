package guru.spring.framework.sfgdiank;

import guru.spring.framework.sfgdiank.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springframework.pets","guru.spring.framework.sfgdiank"})
public class SfgDiAnkApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SfgDiAnkApplication.class, args);


		PetController petController = ac.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ac.getBean("i18nController");
		System.out.println(i18nController.sayHello());

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
