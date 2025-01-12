import java.util.*;

class Test{

  
   static long count(long n){
      if(n==0){
         return 0;
      }else{
         return 1+count(n/10);
      }
     
   }



   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n...");
      long n=shub.nextLong();

      System.out.println("total digits in is "+count(n));

      
   }
}