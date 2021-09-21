package guru.spring.framework.sfgdiank.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.BeanDefinitionDsl;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    public String getMyScope()
    {
        return "I am a Prototype!...";
    }
    public PrototypeBean()
    {
        System.out.println("Creating a Prototype Bean !!!!!!!!!!!!!!!!..");

    }

}
