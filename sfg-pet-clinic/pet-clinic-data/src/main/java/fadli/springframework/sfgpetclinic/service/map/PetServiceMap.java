package fadli.springframework.sfgpetclinic.service.map;

import fadli.springframework.sfgpetclinic.model.Pet;
import fadli.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstracMapService<Pet , Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);

    }


}
