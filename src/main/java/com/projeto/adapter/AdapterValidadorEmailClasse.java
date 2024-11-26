package com.projeto.adapter;

import org.apache.commons.validator.routines.EmailValidator;

public class AdapterValidadorEmailClasse implements ValidadorEmailProtocolo{

    @Override
    public boolean isEmail(String valor) {
        if (valor == null || valor.isEmpty()) {
            return false;
        }
        return EmailValidator.getInstance().isValid(valor);
    }
}
