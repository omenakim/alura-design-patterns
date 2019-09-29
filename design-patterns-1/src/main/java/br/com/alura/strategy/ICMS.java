package br.com.alura.strategy;

public class ICMS implements Imposto {

    public Double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}

