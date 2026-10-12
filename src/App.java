import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        

        tokens tokens = new tokens();
        System.out.println("Alpha:" + tokens.Alpha.value + " Beta:" + tokens.Beta.value + " Delta:" + tokens.Delta.value + " Epsilon:" + tokens.Epsilon.value + " Gamma:" + tokens.Iota.value + " Iota:" + tokens.Lambda.value + " Lambda:" + tokens.Gamma.value + " Omega:" + tokens.Omega.value);
        /*This is where your code goes, good luck */

    }
}

class Token {
    int value;

    Token(int value) {
        this.value = value;
    }
}
class tokens{
    Random rand = new Random();

    Token Alpha = new Token(rand.nextInt(20)+11);
    Token Beta = new Token(rand.nextInt(20)+11);
    Token Delta = new Token(rand.nextInt(20)+11);
    Token Epsilon = new Token(rand.nextInt(20)+11);
    Token Gamma = new Token(rand.nextInt(20)+11);
    Token Iota = new Token(rand.nextInt(20)+11);
    Token Lambda = new Token(rand.nextInt(20)+11);
    Token Omega = new Token(rand.nextInt(20)+11);

    public tokens(){

    }

    public void foldingParent(Token input1, Token input2, Token output1, Token output2){
        if(input1.value == 0 || input2.value == 0){
            return;
        }
        input1.value--;
        input2.value--;
        output1.value++;
        output2.value++;

    }
    
    public void AOtoBE() {
        foldingParent(Alpha, Omega, Beta, Epsilon);
    }

    public void LBtoAD() {
        foldingParent(Lambda, Beta, Alpha, Delta);
    }

    public void DBtoEI() {
        foldingParent(Delta, Beta, Epsilon, Iota);
    }

    public void AEtoDG() {
        foldingParent(Alpha, Epsilon, Delta, Gamma);
    }

    public void EGtoIO() {
        foldingParent(Epsilon, Gamma, Iota, Omega);
    }

    public void DItoGL() {
        foldingParent(Delta, Iota, Gamma, Lambda);
    }

    public void ILtoBO() {
        foldingParent(Iota, Lambda, Beta, Omega);
    }

    public void GOtoAL() {
        foldingParent(Gamma, Omega, Alpha, Lambda);
    }

    public void swap(){
        foldingParent(Alpha, Beta, Delta, Epsilon);
        foldingParent(Gamma, Iota, Lambda, Omega);

    }
    public void swapBack(){
        foldingParent(Delta, Epsilon, Alpha, Beta);
        foldingParent(Lambda, Omega, Gamma, Iota);
    }

}
