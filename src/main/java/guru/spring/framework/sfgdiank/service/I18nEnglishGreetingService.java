package guru.spring.framework.sfgdiank.service;

import guru.spring.framework.sfgdiank.repositories.EnglishGreetingRepositiory;

/**
 * Created by jt on 12/27/19.
 */
/*@Profile("EN")
@Service("i18nService")*/
public class I18nEnglishGreetingService implements GreetingService {
    private EnglishGreetingRepositiory englishGreetingRepositiory;

    public I18nEnglishGreetingService(EnglishGreetingRepositiory englishGreetingRepositiory) {
        this.englishGreetingRepositiory = englishGreetingRepositiory;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepositiory.englishGreeting();
    }
}