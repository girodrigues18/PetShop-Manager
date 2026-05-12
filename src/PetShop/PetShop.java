package PetShop;

import animal.Animal;
import servico.Servico;

import java.util.ArrayList;

public class PetShop implements Calculavel, PetShop.Calculavel.Relatorio {
    private ArrayList<Animal> animais;
    private ArrayList<Servico> servicos;

    public PetShop() {
        animais = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;

        for (Servico s : servicos) {
            for (Animal a : animais) {
                total += s.calcularCusto(a);
            }
        }
        return total;
    }

    @Override
    public String gerarResumo() {
        String resumo = "RELATÓRIO DO PETSHOP\n\n";
        for (Animal a : animais) {
            resumo += "Animal: " + a.getNome() + "\n";
            resumo += "Preço Base: R$ " + a.calcularPrecoBase() + "\n\n";
        }
        return resumo;
    }
}
