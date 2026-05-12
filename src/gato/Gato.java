package gato;

import animal.Animal;

public class Gato extends Animal {
    private String tipoPelagem;

    public Gato(String nome, double peso, String tipoPelagem) {
        super(nome, peso);
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public double calcularPrecoBase() {
        if (tipoPelagem.equalsIgnoreCase("curto")){
            return 45.0;
        } else {
            return 65.0;
        }
    }
}
