public class Capicura_Bd {

public boolean ehCapicura(int num) {
int reverso = 0, original = num, r;

 while(num != 0){
    r = num % 10;
    reverso = reverso * 10 + r;
    num = num / 10;
    }
return reverso == original;
    }
}
