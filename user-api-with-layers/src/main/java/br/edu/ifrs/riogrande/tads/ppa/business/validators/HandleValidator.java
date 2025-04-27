package br.edu.ifrs.riogrande.tads.ppa.business.validators;

import br.edu.ifrs.riogrande.tads.ppa.business.models.NewUser;
import br.edu.ifrs.riogrande.tads.ppa.persistence.UserRepository;

public class HandleValidator {

    private HandleValidator(){

    }

    public static void validator(NewUser newUser, UserRepository userRepository) {
        userRepository.findByHandle(newUser.handle())
                .ifPresent(user -> {
                    throw new IllegalArgumentException("Usuário com o nome " + newUser.handle() + " já existe");
                });
    }

}
