package br.com.josepetruciojr.javacore.Oexception.runtime;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta...";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static String abrirConexao2() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta...";
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
