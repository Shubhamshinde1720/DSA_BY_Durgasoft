import java.util.*;

class PrimeOrNot{

   static boolean isPrime(int n, int i){
      if(i==1){
         return true;
      }else if(n%i==0){
         return false;
      }else{
         return isPrime(n,--i);
      }
   }

   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter a vlaue of n..");
      int n=shub.nextInt();

      System.out.println("The number "+ n+" is prime? "+isPrime(n,n/2));


   }
}