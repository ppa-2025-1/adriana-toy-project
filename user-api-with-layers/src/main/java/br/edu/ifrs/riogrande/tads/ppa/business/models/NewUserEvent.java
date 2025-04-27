package br.edu.ifrs.riogrande.tads.ppa.business.models;

import java.util.List;

import br.edu.ifrs.riogrande.tads.ppa.business.models.Profile.AccountType;

public record NewUserEvent(
                String name,
                String handle,
                String email,
                String password,
                String company,
                AccountType type,
                List<String> roles) {

}
