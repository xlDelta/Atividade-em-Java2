import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int[] vetor = new int[5];
        int opcao;
        boolean dadosInseridos = false;

        Menu_Bd util = new Menu_Bd();

        while (true) {
            String input = JOptionPane.showInputDialog("Menu\n" + "1. Dados do vetor\n" + "2. Ordena vetor\n" + "3. Imprime vetor\n" +  "4. Sair do programa\n" + "Escolha uma opção: ");
            if (input == null) break;  
            opcao = Integer.parseInt(input);
            switch (opcao) {
                
                case 1:
                    util.entrada(vetor);
                    dadosInseridos = true;
                    break;

                case 2:
                    if (dadosInseridos) {
                        util.ordena(vetor);
                        JOptionPane.showMessageDialog(null, "Vetor ordenado com sucesso.");
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1.");
                    }
                    break;

                case 3:
                    if (dadosInseridos) {
                        util.imprime(vetor);
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1.");
                    }
                    break;

                case 4:
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}


