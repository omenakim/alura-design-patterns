package br.com.alura.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraDeImpostosTest {


    @Test
    public void deveCalcularICMS() {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(100.);

        Double valorDoImposto = calculadora.calcular(orcamento, new ICMS());

        assertEquals(new Double(10.), valorDoImposto);
    }

    @Test
    public void deveCalcularISS() {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(100.);

        Double valorDoImposto = calculadora.calcular(orcamento, new ISS());

        assertEquals(new Double(6.), valorDoImposto);
    }

    @Test
    public void deveCalcularMaisDeUmImpposto() {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Orcamento orcamento = new Orcamento(100.);

        Double valorDoImposto = calculadora.calcular(orcamento, new ICMS());
        Double valorDoImposto2 = calculadora.calcular(orcamento, new ISS());

        assertEquals(new Double(16.), new Double(valorDoImposto + valorDoImposto2));

    }

}
