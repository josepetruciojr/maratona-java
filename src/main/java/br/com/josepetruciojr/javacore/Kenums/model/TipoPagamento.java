package br.com.josepetruciojr.javacore.Kenums.model;

/**Enum pode ser declarado dentro de qualquer classe, esse codigo foi refatorada para que a responsabilidade ficasse
 * somente com a classe TipoPagamento e não dentro da classe Cliente como estava.
 */

public enum TipoPagamento {
        DEBITO(1),
        CREDITO(2);

        public final int VALOR;

        TipoPagamento(int valor){
            this.VALOR = valor;
        }

}
