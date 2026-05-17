package modelo;

import interfaces.Calculavel;
import interfaces.Relatorio;
import modelo.animal.Animal;
import modelo.servico.Servico;

import java.util.ArrayList;

public class PetShop implements Calculavel, Relatorio {
    private ArrayList<Animal> animais;
    private ArrayList<Servico> servicos;
    private ArrayList<Atendimento> atendimentos;

    public PetShop() {
        animais = new ArrayList<>();
        servicos = new ArrayList<>();
        atendimentos = new ArrayList<>();
    }

    @Override
    public double calcularTotal() {
        double total = 0;

        for (Atendimento a : atendimentos) {
            total += a.getServico().calcularCusto(a.getAnimal());
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
