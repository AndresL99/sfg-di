package guru.springframework.sfgdi.service;

public class PrimaryGreetingService implements GreetingService
{

    @Override
    public String sayGreeting() {
        return "Hello World! -- From the PRIMARY Bean";
    }
}
