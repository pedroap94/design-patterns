package br.com.loja.observer.acao;

import br.com.loja.command.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements ExecutarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando pedido para o banco de dados");
    }
}
