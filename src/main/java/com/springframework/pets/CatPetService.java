package com.springframework.pets;

import com.springframework.pets.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("CAT")
//@Service
public class CatPetService implements PetService
{

    @Override
    public String getType() {
        return "Cat";
    }
}
