package br.com.josepetruciojr.javacore.Oexception.runtime;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        /*
        Checked e Unchecked
        checked herdam direto de Exception e dão erro em tempo de compilação e sem tratar ele não complia -> ex: IOException, SQLException..
        unchecked herdam de RuntimeException que herda de Exception, quando o programa lança quase sempre é culpa do programador ex: NullPointerException, ArrayOutBoundException..
         */

        //Todas em Runtime
        //NullPointerException
        Object object = null;
        System.out.println(object.toString());

        //ArrayIndexOutOfBoundException
        int[] numero = {1,2};
        System.out.println(numero[2]);
    }
}
