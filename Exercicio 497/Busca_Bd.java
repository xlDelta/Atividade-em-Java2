public class Busca_Bd {
public int busca(int[] vet, int tam, int chave){

int ini = 0, fim = tam - 1, meio;
while (ini <= fim)
{
meio = (ini + fim) / 2;

if (vet[meio] == chave) {
return meio; 
} 

else if (chave < vet[meio]) {
fim = meio - 1; 
} 

else{
ini = meio + 1; 
}

}
return -1; 
}
    
public void ordena(int[] vet, int tam) {
int aux;
for (int li = 0; li < tam - 1; li++){
    
for (int ci = li + 1; ci < tam; ci++){

if (vet[li] > vet[ci]) {                 
aux = vet[li];
vet[li] = vet[ci];
vet[ci] = aux;
}
    
}
}
}
}
