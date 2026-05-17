package util;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {
    public void menu() {
        int opcao = 0;
        String aux;

        aux = """
                1 -> Cadastrar Animal
                2 -> Cadastrar Serviço
                3 -> Calcular conta total
                4 -> Imprimir Relatório
                5 -> Finalizar
                """;

        do {
            try {
                opcao = parseInt(showInputDialog(aux));
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Você deve digitar umas das opções do menu!");
            }
        } while (opcao != 5);
    }
}
