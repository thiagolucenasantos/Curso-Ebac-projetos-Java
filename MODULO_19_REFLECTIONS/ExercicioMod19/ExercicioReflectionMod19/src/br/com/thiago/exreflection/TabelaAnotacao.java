package br.com.thiago.exreflection;

import java.lang.annotation.*;


    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD, ElementType.TYPE})
    public @interface TabelaAnotacao {
        long codigo();

        String nome();

        double valor() default 1d;
    }

