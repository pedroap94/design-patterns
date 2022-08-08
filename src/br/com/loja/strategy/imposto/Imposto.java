package br.com.loja.strategy.imposto;

import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
