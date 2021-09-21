package guru.spring.framework.sfgdiank.repositories;

public class EnglishGreetingRepositioryImpl implements EnglishGreetingRepositiory {
    @Override
    public String englishGreeting()  {
        return "Hello World - EN-";
    }
}
