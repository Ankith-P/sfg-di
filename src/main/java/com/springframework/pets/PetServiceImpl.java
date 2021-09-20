package com.springframework.pets;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ABC")
@Service
public class PetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Beedi Nayi";
    }
}
