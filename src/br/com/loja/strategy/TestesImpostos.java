package br.com.loja.strategy;

import br.com.loja.strategy.imposto.CalculadoraDeImpostos;
import br.com.loja.strategy.imposto.ICMS;
import br.com.loja.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }

}
