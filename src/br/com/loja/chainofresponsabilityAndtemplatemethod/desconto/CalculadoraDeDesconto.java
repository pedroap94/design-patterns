package br.com.loja.chainofresponsabilityAndtemplatemethod.desconto;

import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return new DescontoOrcamentoAcimaCincoItens(
                new DescontoOrcamentoMaiorQuinhentos(
                        new SemDesconto()))
                .calcularDesconto(orcamento);
    }
}
