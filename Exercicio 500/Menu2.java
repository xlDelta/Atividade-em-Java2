import javax.swing.JOptionPane;

public class Menu2 {

    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int opcao;
        boolean dadosAInseridos = false;
        boolean dadosBInseridos = false;

        Menu2_Bd util = new Menu2_Bd();

        while (true) {
            String input = JOptionPane.showInputDialog("Vetores\n" + "1. Dados do Vetor A\n" +"2. Dados do Vetor B\n" + "3. Imprime Vetor \n" +"4. Soma Vetor \n" + "5. Subtrai Vetor \n" + "6. Sai do programa\n" + "opcao: ");
            if (input == null) break; 
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                  
                    util.entrada(vetorA, "A");
                    dadosAInseridos = true;
                    break;

                case 2:
                 
                    util.entrada(vetorB, "B");
                    dadosBInseridos = true;
                    break;

                case 3:
              
                    if (dadosAInseridos && dadosBInseridos) {
                        util.imprime(vetorA, "A");
                        util.imprime(vetorB, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;

                case 4:
         
                    if (dadosAInseridos && dadosBInseridos) {
                        util.soma(vetorA, vetorB);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;

                case 5:
                  
                    if (dadosAInseridos && dadosBInseridos) {
                        util.subtrai(vetorA, vetorB);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 6:
                        JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
