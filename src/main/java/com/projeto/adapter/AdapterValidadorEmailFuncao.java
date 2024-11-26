package com.projeto.adapter;

import org.apache.commons.validator.routines.EmailValidator;

public class AdapterValidadorEmailFuncao {
    public static final ValidadorEmailFuncaoProtocolo INSTANCIA = valor ->
            EmailValidator.getInstance().isValid(valor);
}
