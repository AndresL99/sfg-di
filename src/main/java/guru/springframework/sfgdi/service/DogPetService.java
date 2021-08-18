package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DOG","default"})
@Service
public class DogPetService implements PetService
{

    @Override
    public String getType() {
        return "Dog is amazing";
    }
}
