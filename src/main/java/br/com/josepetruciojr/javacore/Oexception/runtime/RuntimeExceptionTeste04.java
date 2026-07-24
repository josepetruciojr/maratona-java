package br.com.josepetruciojr.javacore.Oexception.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {

        //Não posso ter um tipo mais generico a frente dos tipos especificos,
        //por causa do polimorfismo o primeiro catch é pego e o restante é ignorado
        try{
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        //quando nao for da mesma linha de herança eu posso utilizar o pipe para separar as exception especificas
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
