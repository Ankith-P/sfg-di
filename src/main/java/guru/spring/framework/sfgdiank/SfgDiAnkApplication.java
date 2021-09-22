package guru.spring.framework.sfgdiank;

import guru.spring.framework.sfgdiank.config.PropertiesConfiguration;
import guru.spring.framework.sfgdiank.controller.*;
import guru.spring.framework.sfgdiank.datasource.FakeDataSource;
import guru.spring.framework.sfgdiank.service.PrototypeBean;
import guru.spring.framework.sfgdiank.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.springframework.pets","guru.spring.framework.sfgdiank"})//for pets, now we have move to java configurations
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

		System.out.println("############################Scope Check Starts##################################################### ");
		SingletonBean sb= (SingletonBean) ac.getBean("singletonBean");
		System.out.println("Singleton check "+sb.getMyScope());
		System.out.println("-------- "+sb.getMyScope());
		System.out.println("-------- "+sb);

		SingletonBean sb2= (SingletonBean) ac.getBean("singletonBean");
		System.out.println("Singleton check "+sb2.getMyScope());
		System.out.println("-------- "+sb2.getMyScope());
		System.out.println("-------- "+sb2);

		if(sb.equals(sb2))
		{

			System.out.println("Singleton Check successful !!!!!!!");
		}


		PrototypeBean pb= (PrototypeBean) ac.getBean("prototypeBean");
		System.out.println("Singleton check "+pb.getMyScope());
		System.out.println("-------- "+pb.getMyScope());
		System.out.println("-------- "+pb);

		PrototypeBean pb2= (PrototypeBean) ac.getBean("prototypeBean");
		System.out.println("Singleton check "+pb2.getMyScope());
		System.out.println("-------- "+pb2.getMyScope());
		System.out.println("-------- "+pb2);

		if(pb.equals(pb2))
		{

			System.out.println("Prototype Bean :Same object should not have returned! ");
		}
		else
		{
			System.out.println("Prototype Bean :Different objects are returned !...");
		}

		System.out.println("############################Scope Check Ends##################################################### ");
		FakeDataSource fds=ac.getBean(FakeDataSource.class);
		System.out.println("###############Fake datasource check Starts##################");
		System.out.println("fake datasource username "+fds.getUsername());
		System.out.println("fake datasource password "+fds.getPassword());
		System.out.println("fake datasource username "+fds.getDbUrl());
		System.out.println("###############Fake datasource check##################");


		System.out.println("###############Configuration properties class test starts##################");
		PropertiesConfiguration pc=ac.getBean(PropertiesConfiguration.class);
		System.out.println("PropertiesConfiguration  username "+pc.getUsername());
		System.out.println("PropertiesConfiguration password "+pc.getPassword());
		System.out.println("PropertiesConfiguration dburl "+pc.getDbUrl());
		System.out.println("###############Configuration properties class test ends##################");


	}

}
