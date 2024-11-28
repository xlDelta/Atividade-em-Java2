import javax.swing.JOptionPane;
public class Dobro {

    public static void main(String[] args) {

    //Criar um algoritmo que possa entrar com três números e, para cada um, imprimir o dobro. Usar uma função que retorne valor. 
    int n1,i,x;
    x=0;
    String s;
    Dobro_Bd conta = new Dobro_Bd();

    
    for(i = 0; i<3;i++){
    s = JOptionPane.showInputDialog("Entre com o valor a ser multiplicado");
    n1 = Integer.parseInt (s);
    JOptionPane.showMessageDialog(null,"Dobro: " + conta.calcularDobro(n1) + "\n");

    }    
}
}
