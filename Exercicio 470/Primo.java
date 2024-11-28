import javax.swing.JOptionPane;
public class Primo {

    public static void main(String[] args) {

    //Criar um algoritmo que possa entrar com três números e, para cada um, imprimir o dobro. Usar uma função que retorne valor. 
    int NP;
    String s;
    Primo_Bd conta = new Primo_Bd();
    s = JOptionPane.showInputDialog("Entre com o valor para verificar se é primo:");
    NP = Integer.parseInt (s);
    if(conta.calcularPrimo(NP)== 2){
        JOptionPane.showMessageDialog(null,+NP+" eh um numero Primo");
    }
    else{
        JOptionPane.showMessageDialog(null,+NP+" nao eh um numero Primo");
    }
    }
}
