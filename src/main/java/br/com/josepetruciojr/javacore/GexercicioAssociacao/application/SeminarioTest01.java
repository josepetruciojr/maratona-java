package br.com.josepetruciojr.javacore.GexercicioAssociacao.application;

import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Aluno;
import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Local;
import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Professor;
import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario();
        Seminario seminario1 = new Seminario();
        Professor professor1 = new Professor();
        Local local = new Local();

        local.setEndereco("Rua dos malandros");
        seminario.setTitulo("Tecnologias do Futuro");
        local.setEndereco("Rua dos Valqueires");
        seminario1.setTitulo("Tecnologias Legadas");
        seminario.setLocal(local);
        seminario1.setLocal(local);

        seminario.imprime();
        seminario1.imprime();

        System.out.println("--------------");
        professor1.setNome("Jorge Luiz");
        Seminario[] seminarios = {seminario, seminario1};

        professor1.setEspecialidade("Dr. em Tecnologia da Informação");
        professor1.setSeminarios(seminarios);

        professor1.imprime();

        System.out.println(" ------------ ");
        Aluno aluno1 = new Aluno("José", 23, seminario);
        Aluno aluno2 = new Aluno("Josafa", 26, seminario);
        Aluno aluno3 = new Aluno("Jorgeney", 25, seminario1);
        Aluno aluno4 = new Aluno("João", 24, seminario);
        Aluno aluno5 = new Aluno("Jorge", 22, seminario1);


        Aluno[] alunos1 = {aluno1, aluno2, aluno4};
        Aluno[] alunos2 = {aluno3, aluno5};

        seminario.setAlunos(alunos1);
        seminario1.setAlunos(alunos2);

        seminario.imprimeParticipantes();
        System.out.println("-----------");
        seminario1.imprimeParticipantes();




    }
}
