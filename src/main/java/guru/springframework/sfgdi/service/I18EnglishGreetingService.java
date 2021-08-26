package guru.springframework.sfgdi.service;


import guru.springframework.sfgdi.repository.EnglishGreetingRepository;

public class I18EnglishGreetingService implements GreetingService
{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18EnglishGreetingService(EnglishGreetingRepository englishGreetingRepository)
    {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World! -- EN";
    }
}

