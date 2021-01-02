package com.aulas.java.annotations;
@InformacaoAula(
        autor = "Sandro", aulaNumero = 65, blog = "sandro.com"
)
public class Teste {
    //Anotação pode ser usada dessa forma também
    @InformacaoAula(
            autor = "Sandro", aulaNumero = 65, blog = "sandro.com"
    )

    public static void main(String[] args) {
    }

}
