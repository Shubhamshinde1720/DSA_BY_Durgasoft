import java.util.*;


class SumOfDigits{

   static int sumOfD(int n){
      if(n==0){
         return 0;
      }else{
         return n%10+sumOfD(n/10);
      }
   }



   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n...");
      int n=shub.nextInt();

      System.out.println("Sum of digits of number "+n+" is = "+sumOfD(n));
   }
}