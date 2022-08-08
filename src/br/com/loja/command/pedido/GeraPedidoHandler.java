package br.com.loja.command.pedido;

import br.com.loja.observer.acao.EnviarEmailPedido;
import br.com.loja.observer.acao.ExecutarPedido;
import br.com.loja.observer.acao.SalvarPedidoNoBancoDeDados;
import br.com.loja.strategy.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<ExecutarPedido> acoes;

    public GeraPedidoHandler(List<ExecutarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executar(pedido));
    }
}
