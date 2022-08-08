Para aplicar esse padrão fazemos a criação de um método concreto na classe pai, 
que chama métodos abstratos implementados nas classes filhos. Com isso, conseguimos reaproveitar
trechos de códigos comuns.

Por exemplo, quando temos um método *calcula* que realiza um cálculo após uma condição,
podemos criar na classe mãe 3 métodos:
- um método para verificar a condição da aplicação.
- um método para dar o retorno caso aquela condição seja verdadeira.
- um método concreto que chama os outros dois métodos, unindo a verificação com o retorno.

Com isso, nas classes filhas precisamos apenas usar herança para extender os métodos de
verificação da condição e de retorno para caso a condição seja verdadeira, deixando assim
o método concreto que faz a união dos outros dois métodos
na classe pai.