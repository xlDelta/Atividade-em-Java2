public class Ordenar_Bd {
public void ordena(String[] vet, int tam){

String aux;
for (int li = 0; li < tam - 1; li++) {
for (int ci = li + 1; ci < tam; ci++) {

if (vet[li].compareTo(vet[ci]) > 0) {
aux = vet[li];
vet[li] = vet[ci];
vet[ci] = aux;
}
}
}
}
}
