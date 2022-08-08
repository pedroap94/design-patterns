Esse padrão é baseado em estado.
Utilizamos esse padrão de projeto quando precisamos aplicar um algorítimo, ou uma regra de negócio
baseada no estado.

Criamos então uma classe para cada estado. Utilizamos uma classe abstrata para implementar as 
regras gerais, assim, em cada classe conseguimos criar uma regra diferente a partir da classe
implementada.

Esse padrão também nos permite transitar entre os estados através de regras.
Por exemplo: estando no status A e acontecendo tal coisa, vai para o estado B.
