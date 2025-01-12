import java.util.*;

class Fibonacci{

   static int fib(int n){
      if(n==0||n==1){
         return n;
      }else{
         return fib(n-1)+fib(n-2);
      }
   }

   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter a number");

      int n=shub.nextInt();

      System.out.print(fib(n));
      
   
   }
}