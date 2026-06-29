package br.com.josepetruciojr.javacore.AintroducaoClasses.application;

import br.com.josepetruciojr.javacore.AintroducaoClasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Jão";
        professor.gender = 'M';
        professor.age = 29;

        System.out.println("Nome: " + professor.name + "\nIdade: " + professor.age + "\nSexo: " + professor.gender);
    }
}
