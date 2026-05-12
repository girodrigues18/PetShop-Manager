package passaro;

import animal.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        System.out.println("Preço base é fixo! O estabelecimento não oferece serviço de banho!");
        return 30.0;
    }
}
