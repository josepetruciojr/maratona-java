package br.com.josepetruciojr.javacore.Kenums.model;

/**Enum pode ser declarado dentro de qualquer classe, esse codigo foi refatorada para que a responsabilidade ficasse
 * somente com a classe TipoPagamento e não dentro da classe Cliente como estava.
 * o construtor de enum é privado.
 */

public enum TipoPagamento {
        DEBITO{
                @Override
                public Double calcularDesconto(double valor) {
                        return valor * 0.1;
                }
        },
        CREDITO{
                @Override
                public Double calcularDesconto(double valor) {
                        return valor * 0.05;
                }
        };
        //Metodos abstratos (Interfaces) forçam a sobrescrita na implementação nestas enumerações.
        public abstract Double calcularDesconto(double valor);
}
