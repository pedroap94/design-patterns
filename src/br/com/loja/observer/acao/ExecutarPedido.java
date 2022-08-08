package br.com.loja.observer.acao;

import br.com.loja.command.pedido.Pedido;

public interface ExecutarPedido {
    public void executar(Pedido pedido);
}
