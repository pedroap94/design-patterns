package br.com.loja.chainofresponsabilityAndtemplatemethod;

import br.com.loja.chainofresponsabilityAndtemplatemethod.desconto.CalculadoraDeDesconto;
import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 6);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        System.out.println(calculadoraDeDesconto.calcularDesconto(orcamento));
    }
}
