package br.com.loja.chainofresponsabilityAndtemplatemethod.desconto;

import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoAcimaCincoItens extends Desconto {

    public DescontoOrcamentoAcimaCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
