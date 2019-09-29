package br.com.alura.strategy;

public class ISS implements Imposto {

    public Double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
