package modelo.servico;

import modelo.animal.Animal;

public class Banho extends Servico {

    public Banho(String descricao, int duracaoMinutos) {
        super(descricao, duracaoMinutos);
    }

    public double calcularCusto(Animal a){
        return a.calcularPrecoBase() + (getDuracaoMinutos() * 0.50);
    };
}
