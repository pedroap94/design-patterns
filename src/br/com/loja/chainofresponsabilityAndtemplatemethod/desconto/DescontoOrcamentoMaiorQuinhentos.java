package br.com.loja.chainofresponsabilityAndtemplatemethod.desconto;

import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQuinhentos extends Desconto{
    public DescontoOrcamentoMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
