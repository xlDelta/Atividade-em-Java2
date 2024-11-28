public class Remove_Bd {
    public int remover(String palavra, String letra) {
    int verifica = 0;


    while (palavra.contains(letra)) {
    palavra = palavra.replaceFirst(letra, "*");
    verifica++;
    }
    return verifica;
    }
}
