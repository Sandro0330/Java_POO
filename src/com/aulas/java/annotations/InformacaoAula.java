package com.aulas.java.annotations;

@interface InformacaoAula {

    String autor();

    int aulaNumero();

    String blog() default "http://sandro.com";

    String site() default  "http://sandro.com.br";



}
