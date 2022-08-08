Temos vários observers (observadores) que ficam a ouvir um evento, até que ele é disparado e
ativa os observadores.

Aqui neste exemplo, o disparo do evento ocorre na GeraPedidoHandler ao chamar o método executa().
Como executa() faz parte da interface ExecutarPedido, temos várias classes observadoras
instanciando e implementando esse método.

Com isso, estas classes podem ser chamadas ao disparar o evento.

São exemplos de observadores: EnviarEmailPedido e SalvarPedidoNoBancoDeDados.