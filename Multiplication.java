import java.util.*;

class Multiplication{

   static int multiply(int a, int b){
      if(a<b){
         return multiply(b,a);
      }else if(b!=0){
         return a+multiply(a,--b);
      }else{
         return 0;
      }
   }
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();

      System.out.print("Product of "+a+" into "+b+" without using * operator is = "+multiply(a,b));


   }
}