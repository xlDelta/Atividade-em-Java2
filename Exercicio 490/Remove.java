import javax.swing.JOptionPane;

public class Remove {

    public static void main(String[] args) {
        String[] palavras = new String[10];
        int i;
        Remove_Bd conta = new Remove_Bd();

        
        String letra = JOptionPane.showInputDialog("Digite a letra para substituir:");

        for (i = 0; i < 10; i++) {
            palavras[i] = JOptionPane.showInputDialog("Digite palavra em letras minusculas " + (i + 1) + ":");
            int removidos = conta.remover(palavras[i], letra);
            System.out.println("Total de caracteres '" + letra + "' removidos: " + removidos);
        }

        for (i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + palavras[i]);
        }
    }
}
