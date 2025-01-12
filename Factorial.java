import java.util.*;

class Factorial{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n");
      int n=shub.nextInt();

      System.out.println("================Loops===========");
      int fact=0;
      for(int i=1;i<=n;i++){
         if(n%i==0){
            fact++;
         }
      }

      System.out.print(n+" is a Prime Number : ");
      System.out.println((fact==2)?"YES":"NO");

            System.out.println("================Recursion===========");

            System.out.println(n+" is a prime number : "+isPrime(n,n-1));



   }

   static boolean isPrime(int n, int i){
      if(n==1){
         return true;
      }else if(n%i==0){
         return false;
      }else{
         return isPrime(n, --i);
      }
   }
}