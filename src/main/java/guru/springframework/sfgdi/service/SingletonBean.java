package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean
{
    public SingletonBean()
    {
        System.out.println("Creating a Singleton Bean!!");
    }

    public String getMyScope()
    {
        return "I am a Singleton.";
    }
}
