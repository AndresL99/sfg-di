package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CAT")
@Service
public class CatPetService implements PetService
{

    @Override
    public String getType() {
        return "Cat";
    }
}
