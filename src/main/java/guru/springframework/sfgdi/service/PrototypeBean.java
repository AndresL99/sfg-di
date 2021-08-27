package guru.springframework.sfgdi.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean
{
    public PrototypeBean()
    {
        System.out.println("I am Prototype Bean!!!!!");
    }

    public String getMyScope()
    {
        return "I am Prototype";
    }
}
