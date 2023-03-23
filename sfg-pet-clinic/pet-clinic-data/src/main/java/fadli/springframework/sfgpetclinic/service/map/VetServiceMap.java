package fadli.springframework.sfgpetclinic.service.map;

import fadli.springframework.sfgpetclinic.model.Pet;
import fadli.springframework.sfgpetclinic.model.Vet;
import fadli.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstracMapService<Vet, Long> implements CrudService<Vet, Long > {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);

    }
}
