import javax.swing.JOptionPane;
class Menu2_Bd {

    public void entrada(int[] vet, String nomeVetor) {
        for (int i = 0; i < vet.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o numero " + (i + 1) + " para o vetor " + nomeVetor + ":");
            vet[i] = Integer.parseInt(input);
        }
    }

    public void imprime(int[] vet, String nomeVetor) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nvetor ").append(nomeVetor).append(":\n");
        for (int i = 0; i < vet.length; i++) {
            sb.append((i + 1)).append(" - ").append(vet[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        }

    public void soma(int[] vetA, int[] vetB) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nsoma\n");
        for (int i = 0; i < vetA.length; i++) {
            sb.append(vetA[i] + vetB[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        }

    public void subtrai(int[] vetA, int[] vetB) {
        StringBuilder sb = new StringBuilder();
        sb.append("\ndiferenca\n");
        for (int i = 0; i < vetA.length; i++) {
            sb.append(vetA[i] - vetB[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        }
}
