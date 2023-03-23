package fadli.springframework.sfgpetclinic.service;

import fadli.springframework.sfgpetclinic.model.Owner;
import fadli.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
