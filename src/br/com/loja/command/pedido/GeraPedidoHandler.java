package br.com.loja.command.pedido;

import br.com.loja.strategy.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //fariamos aqui injeção de dependendências, por exemplo, da PedidoRepository e EmailService para injetar no método executa()

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
