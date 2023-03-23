package fadli.springframework.sfgpetclinic.service;

import fadli.springframework.sfgpetclinic.model.Owner;
import fadli.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
