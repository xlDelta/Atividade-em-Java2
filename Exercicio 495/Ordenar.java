import javax.swing.JOptionPane;

public class Ordenar {

    public static void main(String[] args) {
        String[] nomes = new String[5];
        int i;
        Ordenar_Bd conta = new Ordenar_Bd();

      
        for (i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }

        conta.ordena(nomes, nomes.length);
        System.out.println("\nNomes em ordem");
        for (i = 0; i < 5; i++) {
        System.out.println((i + 1) + " - " + nomes[i]);
        }
        }
        }
