import javax.swing.JOptionPane;


public class Capicura {

    public static void main(String[] args) {

        // Criar um algoritmo que verifique se um número é capicua.
        int n;
        String s;
        Capicura_Bd conta = new Capicura_Bd();
        s = JOptionPane.showInputDialog("Digite um número:");
        n = Integer.parseInt(s);
        
        if(conta.ehCapicura(n)){
            JOptionPane.showMessageDialog(null, n + " é um número capicua");
        } else {
            JOptionPane.showMessageDialog(null, n + " não é um número capicua");
        }
    }
}

  