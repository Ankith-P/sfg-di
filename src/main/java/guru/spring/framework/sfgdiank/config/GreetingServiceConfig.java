package guru.spring.framework.sfgdiank.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.spring.framework.sfgdiank.datasource.FakeDataSource;
import guru.spring.framework.sfgdiank.repositories.EnglishGreetingRepositiory;
import guru.spring.framework.sfgdiank.repositories.EnglishGreetingRepositioryImpl;
import guru.spring.framework.sfgdiank.repositories.SpanishGreetingRepository;
import guru.spring.framework.sfgdiank.repositories.SpanishGreetingRepositoryImpl;
import guru.spring.framework.sfgdiank.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    //@Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingServiceImpl1()
    {
        return new ConstructorInjectedGreetingServiceImpl();
    }
    /*ank.jdbc.username=username1
    ank.jdbc.password=password1
    ank.jdbc.url=jdbc.oracle.thin:localhost:1521:orcl*/

    @Bean
    FakeDataSource fakeDataSource(@Value("${ank.jdbc.username}")String username,@Value("${ank.jdbc.password}") String password,@Value("${ank.jdbc.url}") String dbUrl)
    {
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl1()
    {
        return new PropertyInjectedGreetingServiceImpl();
    }

    @Bean
    setterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl()
    {
        return new setterInjectedGreetingServiceImpl();
    }
    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingServiceImpl()
    {
        return new PrimaryGreetingServiceImpl();
    }
   @Profile("EN")
   /* @Bean("i18nService")
    guru.spring.framework.sfgdiank.service.I18nEnglishGreetingService i18nEnglishGreetingService()*/
  @Bean("i18nService")
    guru.spring.framework.sfgdiank.service.I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepositiory englishGreetingRepositiory)
    {
        return new I18nEnglishGreetingService(englishGreetingRepositiory);
    }

    @Bean
    EnglishGreetingRepositiory englishGreetingRepositiory()
    {
        return new EnglishGreetingRepositioryImpl();
    }

    @Profile({"ES", "default"})
   @Bean("i18nService")
    I18NSpanishService I18NSpanishService(SpanishGreetingRepository spanishGreetingRepository)
    {
        return new I18NSpanishService(spanishGreetingRepository);
    }

    @Bean
    SpanishGreetingRepository spanishGreetingRepository()
    {
        return new SpanishGreetingRepositoryImpl();
    }

    @Bean
    PetServiceFactory petServiceFactory()
    {
        return new PetServiceFactory();
    }
    @Profile("dog")
    @Bean
    @Primary
    PetService dogPetService(PetServiceFactory petServiceFactory)
    {
       return petServiceFactory.getPetService("dog");
    }
    @Profile({"cat","default"})

    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("cat");
    }


}
