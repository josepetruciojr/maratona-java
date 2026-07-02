package br.com.josepetruciojr.javacore.Gassociacao.application;

import br.com.josepetruciojr.javacore.Gassociacao.model.Escola;
import br.com.josepetruciojr.javacore.Gassociacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("José");
        Professor professor2 = new Professor("José P");
        Professor professor3 = new Professor("José Jr");

        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Academia JoBola", professores);

        escola.imprime();
    }
}
