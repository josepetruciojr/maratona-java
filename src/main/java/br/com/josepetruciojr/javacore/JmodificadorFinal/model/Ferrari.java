package br.com.josepetruciojr.javacore.JmodificadorFinal.model;

/*
A palavra final na classe garante que uma classe nao seja herdada.. ex: class String
A palavra final no metodo não pode ser sobrescrito.
Se a clsse for final fica redundante os metodos serem final, pq ja que uma classe nao pode ser herdada,
logo seus metodos nao podem ser sobrescritos
 */
public final class Ferrari extends Carro{

    public final void imprime(){

    }

}
