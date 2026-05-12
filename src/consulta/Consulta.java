package consulta;

import animal.Animal;
import servico.Servico;

public class Consulta extends Servico {
    public Consulta(String descricao, int duracaoMin) {
        super(descricao, duracaoMin);
    }

    public double calcularCusto(Animal a){
        return a.calcularPrecoBase() + 35.0;
    }
}
