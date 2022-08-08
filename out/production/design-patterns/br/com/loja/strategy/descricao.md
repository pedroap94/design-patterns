Utilizamos esse padrão quando há diversos possíveis algoritmos para uma ação. 
Ou seja, nós conseguimos remover vários if-else no método,
substituindo por implementações de classe abstrata ou interface.


Exemplo:
temos diversos impostos que podem ser aplicados.

Podemos criar uma interface de imposto, criar uma classe para cada imposto específico
estendendo a interface, e na hora de aplicar em uma classe principal,
fazemos a implementação da classe de imposto correto usando a interface.

```java
public void calcular (BigDecimal valor, Imposto imposto){
    imposto.calcularImposto(valor)
}
```

Como as classes que irão implementar o método calcularImposto, já que estão implementando
a interface, o argumento "imposto" irá direcionar para a classe correta.
