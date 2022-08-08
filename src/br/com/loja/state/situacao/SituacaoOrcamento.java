package br.com.loja.state.situacao;

import br.com.loja.exception.DomainException;
import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser reprovado");
    }

    public void finalizado(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado");
    }
}
