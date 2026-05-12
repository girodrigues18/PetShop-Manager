package cachorro;

import animal.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        if (peso <= 10){
            return 40.0;
        } else if (peso > 10){
            return 60.0;
        } else {
            return 85.0;
        }
    }
}
