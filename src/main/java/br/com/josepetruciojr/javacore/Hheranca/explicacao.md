0- Bloco de inicialização estático da superclasse é executado quando a 
JVM carregar a classe pai.

1- Bloco de inicialização estático da subclasse é executado quando a
JVM carregar a classe filha.

2- Alocado espaço em memoria para o objeto da classe pai.

3- cada atributo da superclasse é criado e inicializado com os valores default 
ou o que for passado na classe pai.

4- Bloco de inicialização da superclasse é executado na ordem que aparece.

5- Construtor da super classe é executado.

6- Alocado espaço em memoria para a subclasse

7- Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado

8- Bloco de inicialização da subclasse é executado na ordem que aparece.

9- O construtor da subclasse é executado.

-- Exemplo da classe HerancaTest02 --
Dentro do bloco estático de inicilização de Pessoa
Dentro do bloco estático de inicilização de Funcionario
Dentro do bloco não estático de Pessoa 1
Dentro do bloco não estático de Pessoa 2
Dentro do Construtor Pessoa
Dentro do bloco não estático de Funcionario 1
Dentro do bloco não estático de Funcionario 2
Dentro do Contrutor de Funcionario