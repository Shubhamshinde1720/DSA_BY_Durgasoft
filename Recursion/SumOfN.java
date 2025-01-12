import java.util.*;

class SumOfN{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n...");
      int n=shub.nextInt();

      System.out.println(sumOfN(n));
   }

   static int sumOfN(int n){
      if(n==1){
         return 1;
      }else{
         return n+sumOfN(--n);
      }
   }
}