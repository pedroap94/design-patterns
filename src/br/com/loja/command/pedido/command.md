Este padrão de projeto serve para criar geradores.
Quando criamos um gerador, não precisamos ficar instanciando várias e várias coisas direto
na classe principal, podemos simplesmente criar o necessário e chamar o gerador.

O gerador utiliza também um handler para fazer injeção de dependências necessárias.

Então, o objetivo maior desse padrão é centralizar a criação de algum objeto que precisa
de várias dependências, e com isso facilitar a criação do mesmo.
Basicamente, é uma forma de reutilizar código para gerar um objeto que precisa de várias
dependências e que pode ser criado em vários lugares diferentes.