package br.com.alura.strategy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class CalculadoraDeImpostos {

    public Double calcular(Orcamento orcamento, Imposto impostoParaCalcular) {

        return impostoParaCalcular.calcular(orcamento);

    }

}
