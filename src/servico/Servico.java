package servico;

import animal.Animal;

public abstract class Servico {
    protected String descricao;
    protected int duracaoMinutos;

    public Servico(String descricao, int duracaoMinutos) {
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
    }

    public abstract double calcularCusto(Animal a);

    public String getDescricao() {
        return descricao;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
