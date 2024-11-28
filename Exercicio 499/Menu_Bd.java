
import javax.swing.JOptionPane;

public class Menu_Bd {

    public void entrada(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
        String input = JOptionPane.showInputDialog("Digite o numero " + (i + 1) + ": ");
        vet[i] = Integer.parseInt(input); 
        }
        }

    public void ordena(int[] vet) {
        int aux;
        for (int li = 0; li < vet.length - 1; li++) {
        for (int ci = li + 1; ci < vet.length; ci++) {
        if (vet[li] > vet[ci]) {
        aux = vet[li];
        vet[li] = vet[ci];
        vet[ci] = aux;
        }
        }
        }
        }

   public void imprime(int[] vet) {
        System.out.println("\nVetor:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
    }
    }
    }
    
