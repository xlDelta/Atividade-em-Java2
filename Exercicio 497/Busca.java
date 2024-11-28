//Criar uma função que implemente uma busca binária. Esta função recebe um vetor de inteiros, seu tamanho e uma chave e retorna a posição da chave no vetor.
//Lembre-se de que o vetor deverá estar ordenado. 

import javax.swing.JOptionPane;
public class Busca{

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int chave, posicao;
        Busca_Bd util = new Busca_Bd();

        for (int i = 0; i < 10; i++) {
        numeros[i] = Integer.parseInt(
        JOptionPane.showInputDialog("Digite numero " + (i + 1) + ":")
        );
        }
        chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de pesquisa:"));
        util.ordena(numeros, numeros.length);

        posicao = util.busca(numeros, numeros.length, chave);
        System.out.println("\nEm ordem");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + numeros[i]);
        }

       
        if (posicao >= 0) {
            System.out.println("\nPosicao no vetor: " + (posicao + 1));
        } else {
            System.out.println("\nnao encontrado");
}
}
}
