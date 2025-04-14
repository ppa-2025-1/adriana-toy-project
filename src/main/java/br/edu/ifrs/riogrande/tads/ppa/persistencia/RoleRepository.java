package br.edu.ifrs.riogrande.tads.ppa.persistencia;

import java.util.Collection;
import java.util.Set;

import br.edu.ifrs.riogrande.tads.ppa.negocio.Role;
import org.springframework.data.repository.ListCrudRepository;

public interface RoleRepository extends ListCrudRepository<Role, Integer> {
    // This interface will automatically provide CRUD operations for the Role entity
    // You can add custom query methods here if needed

    Role findByName(String name);

    Set<Role> findByNameIn(Collection<String> names);

    boolean existsByName(String name);
    
}
