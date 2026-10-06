import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        

        values values = new values();
        System.out.println("Alpha:" + values.Alpha + " Beta:" + values.Beta + " Delta:" + values.Delta + " Epsilon:" + values.Epsilon + " Gamma:" + values.Iota + " Iota:" + values.Lambda + " Lambda:" + values.Gamma + " Omega:" + values.Omega + " total:" + values.Total);
        /*This is where your code goes, good luck */

    }
}

class values{
    Random rand = new Random();

    int Alpha;
    int Beta;
    int Delta;
    int Epsilon;
    int Gamma;
    int Iota;
    int Lambda;
    int Omega;

    int Total;

    public values(){
        Alpha = rand.nextInt(10)+1;
        Beta = rand.nextInt(10)+1;
        Delta = rand.nextInt(10)+1;
        Epsilon = rand.nextInt(10)+1;
        Gamma = rand.nextInt(10)+1;
        Iota = rand.nextInt(10)+1;
        Lambda = rand.nextInt(10)+1;
        Omega = rand.nextInt(10)+1;
        Total = Alpha + Beta + Delta + Epsilon + Gamma + Iota + Lambda + Omega;
        
        int remander = Total % 8;
        if (remander != 0){
            Omega += remander;
        }
    }
    public void foldingParent(int input1, int input2, int output1, int output2){
        if(input1 == 0 || input2 == 0){
            return;
        }
        input1--;
        input2--;
        output1++;
        output2++;
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

}
