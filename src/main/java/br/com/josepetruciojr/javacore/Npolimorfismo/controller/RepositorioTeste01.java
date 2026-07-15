package br.com.josepetruciojr.javacore.Npolimorfismo.controller;

import br.com.josepetruciojr.javacore.Npolimorfismo.repository.Repositorio;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.RepositorioArquivo;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        System.out.println("------------");
        repositorio = new RepositorioArquivo();
        repositorio.salvar();
        System.out.println("------------");
        repositorio = new RepositorioMemoria();
        repositorio.salvar();

        /*
        Outro exemplo que utiliza o mesmo principio do polimorfismo de classes genericas para especificas
        Collections ex: List<T> lista = new ArrayList<>() ou List<T> lista = new LinkedList<>();
        como no teste acima tentar utilizar de um tipo especifico para um classe irmã não funciona
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
