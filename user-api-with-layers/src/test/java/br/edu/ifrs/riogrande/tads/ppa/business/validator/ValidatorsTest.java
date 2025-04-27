package br.edu.ifrs.riogrande.tads.ppa.business.validator;

import br.edu.ifrs.riogrande.tads.ppa.business.models.NewUser;
import br.edu.ifrs.riogrande.tads.ppa.business.models.Profile;
import br.edu.ifrs.riogrande.tads.ppa.business.validators.EmailValidator;
import br.edu.ifrs.riogrande.tads.ppa.business.validators.PasswordValidator;
import br.edu.ifrs.riogrande.tads.ppa.persistence.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorsTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testEmailExceptions() {

        NewUser newUser = new NewUser(
                "Usuario1",
                "userOne",
                "emailsemarroba.com",
                "Senha123",
                "Empresa X",
                Profile.AccountType.FREE,
                List.of("ROLE_USER")
        );

        assertThrows(IllegalArgumentException.class, () -> {
            EmailValidator.validator(newUser, userRepository);
        });
    }

    @Test
    void testPasswordExceptions() {
        NewUser newUser = new NewUser(
                "Usuario1",
                "userOne",
                "email@email.com",
                "123",
                "Empresa X",
                Profile.AccountType.FREE,
                List.of("ROLE_USER")
        );

        assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validator(newUser);
        });
    }

}
