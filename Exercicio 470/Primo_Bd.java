
public class Primo_Bd{ 

int calcularPrimo(int NP){ 

int divisao = 1, verificar = 0;

while (divisao <= NP){
if (NP % divisao == 0){ 
verificar++;

}
divisao++;
}

return verificar;
}
}