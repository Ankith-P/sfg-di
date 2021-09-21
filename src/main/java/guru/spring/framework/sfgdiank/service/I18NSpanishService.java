package guru.spring.framework.sfgdiank.service;

import guru.spring.framework.sfgdiank.repositories.SpanishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
/*@Profile({"ES", "default"})
@Service("i18nService")*/
public class I18NSpanishService implements GreetingService {
    private SpanishGreetingRepository spanishGreetingRepository;

    public I18NSpanishService(SpanishGreetingRepository spanishGreetingRepository) {
        this.spanishGreetingRepository = spanishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return spanishGreetingRepository.spanishGreeting();
    }
}