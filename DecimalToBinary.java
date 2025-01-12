import java.util.*;

class DecimalToBinary{

   static void binary(int n){
      if(n!=0){
         binary(n/2);
         System.out.print(n%2);
      }
   }
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n..");
      int n=shub.nextInt();

      System.out.println("binary conversion of "+n+" is ==> ");
      binary(n);


   }
}