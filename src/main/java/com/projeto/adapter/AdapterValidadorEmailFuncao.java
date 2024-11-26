package com.projeto.adapter;

import org.apache.commons.validator.routines.EmailValidator;

public class AdapterValidadorEmailFuncao {
    public static final ValidadorEmailFuncaoProtocolo INSTANCIA = valor -> {
        if (valor == null || valor.isEmpty()) {
            return false;
        }
        return EmailValidator.getInstance().isValid(valor);
    };
}
