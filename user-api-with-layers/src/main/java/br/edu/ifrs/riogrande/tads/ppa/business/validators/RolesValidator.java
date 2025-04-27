package br.edu.ifrs.riogrande.tads.ppa.business.validators;

import br.edu.ifrs.riogrande.tads.ppa.business.models.NewUser;
import br.edu.ifrs.riogrande.tads.ppa.business.models.Role;
import br.edu.ifrs.riogrande.tads.ppa.persistence.RoleRepository;

import java.util.Set;

public class RolesValidator {

    private RolesValidator() {
    }

    public static void validator(NewUser newUser, Set<Role> roles, RoleRepository roleRepository) {
        Set<Role> additionalRoles = roleRepository.findByNameIn(newUser.roles());

        if (additionalRoles.size() != newUser.roles().size()) {
            throw new IllegalArgumentException("Alguns papéis não existem");
        }

        if (roles.isEmpty()) {
            throw new IllegalArgumentException("O usuário deve ter pelo menos um papel");
        }
    }
}
