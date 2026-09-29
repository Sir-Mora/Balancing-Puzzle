import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Given there are the 8 values.
        and there are 8 functions that convert 2 values to 2 other values, as well as 1 function that converts 4 values into 4 other values.
        And that you may only use those functions to modify the values
        Balance the values so that they are as equal as possible

        These are the values
        A Alpha
        B Beta
        D Delta
        E Epsilon
        G Gamma
        I Iota
        L Lambda
        O Omega

        These are the folding functions
        A O	==>	B E
        L B	==> A D
        D B	==>	E I
        A E	==>	D G
        E G	==>	I O
        D I	==>	G L
        I L	==>	B O
        G O	==>	A L

        This is the swapping function
        A B G I ==> D E L O
        */

        values values = new values();
        System.out.println("Alpha:" + values.Alpha + " Beta:" + values.Beta + " Delta:" + values.Delta + " Epsilon:" + values.Epsilon);
        /*This is where your code goes, good luck */

    }
}

class values{
    Random rand = new Random();

    int Alpha = rand.nextInt(10)+1;
    int Beta = rand.nextInt(10)+1;
    int Delta = rand.nextInt(10)+1;
    int Epsilon = rand.nextInt(10)+1;
    int Gamma = rand.nextInt(10)+1;
    int Iota = rand.nextInt(10)+1;
    int Lambda = rand.nextInt(10)+1;
    int Omega = rand.nextInt(10)+1;

    int Total = Alpha + Beta + Delta + Epsilon + Gamma + Iota + Lambda + Omega;
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
