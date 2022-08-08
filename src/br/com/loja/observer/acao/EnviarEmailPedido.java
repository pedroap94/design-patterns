package br.com.loja.observer.acao;

import br.com.loja.command.pedido.Pedido;

public class EnviarEmailPedido implements ExecutarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido");
    }
}
