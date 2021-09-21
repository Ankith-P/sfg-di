package guru.spring.framework.sfgdiank.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public String getMyScope()
    {
    return "I am a Singleton!...";
    }
    public SingletonBean()
    {
        System.out.println("Creating a singleton Bean !..");

    }


}
