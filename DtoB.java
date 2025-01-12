import java.util.*;

class DtoB{

   static int binary(int n){
      if(n==0){
         return 0;
      }else{
         return (n%2+10*binary(n/2));
      }
   }


   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n...");
      int n=shub.nextInt();

      System.out.println("Binaray Coversion of "+n+" is ==> "+binary(n));


   }
}