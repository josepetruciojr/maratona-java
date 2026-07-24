package br.com.josepetruciojr.javacore.Oexception.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static double divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento ilegal, divisão não pode ser por zero");
        }
        return a/b;
    }
}
