package prime.numbers;

public class PrimeNumbers {

    public static  boolean isPrime(int NumBer){
        if (NumBer<=1){
            return false;
        }
        for (int i=2; i <=Math.sqrt(NumBer);i++){
            if (NumBer % i == 0){
                return false;
            }
        }
        return true;
    }
 public static void main(String[]args){
     for (int i=1;i<=500;i++){
         if (isPrime(i)){
             System.out.print(i+" ");
         
     }
   }
 }
}
