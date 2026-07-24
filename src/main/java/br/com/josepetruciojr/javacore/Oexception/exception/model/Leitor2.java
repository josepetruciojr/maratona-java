package br.com.josepetruciojr.javacore.Oexception.exception.model;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor2");
    }
}
