package guru.spring.framework.sfgdiank.config;

import guru.spring.framework.sfgdiank.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingServiceImpl1()
    {
        return new ConstructorInjectedGreetingServiceImpl();
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
  //  @Profile("EN")
   /* @Bean("i18nService")
    guru.spring.framework.sfgdiank.service.I18nEnglishGreetingService i18nEnglishGreetingService()*/
  @Bean("i18nService")
    guru.spring.framework.sfgdiank.service.I18nEnglishGreetingService i18nEnglishGreetingService()
    {
        return new I18nEnglishGreetingService();
    }

   // @Profile({"ES", "default"})
   @Bean("i18nService")
    I18NSpanishService I18NSpanishService()
    {
        return new I18NSpanishService();
    }


}
