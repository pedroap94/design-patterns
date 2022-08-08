Usamos o padrão chain-of-responsability quando temos uma indecisão de que classe será aplicada
em nosso objeto. Podemos ter várias coisas diferentes que podem ocorrer com ele, como por exemplo
 um desconto para tantos itens, ou o desconto para tanto de custo do item.

Como não sabemos qual desconto será aplicado ao ítem antes dele ser analisado,
podemos utilizar o chain of responsability, chamando ordenadamente cada uma das classes
com seus devidos métodos até que ele chegue na correspondente e retorne a modificação desejada.
Caso a modificação não seja aplicada no primeiro método, o próximo será chamado e assim sucessivamente.


Seria possível fazer um encadeamento de "if's" para realizar o mesmo proceidmento, porém
a manutenabilidade disso seria horrível, além de ficar uma escrita confusa.

O que difere a lógica de implementação desse padrão em relação ao strategy pattern, é que
no chain-of-responsability não sabemos qual classe com o método de moficação será implementado
no objeto, enquanto no strategy sabemos exatamente qual será implementado, fazendo com que
apenas uma classe seja chamada para a implementação do objeto.