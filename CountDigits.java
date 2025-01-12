import java.util.*;

class CountDigits{

static int d=0;
   static int countD(int n){
      if(n==0){
         return 0;
      }else{
         d++;
         countD(n/10);
      }

      return d;
   }


   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter a value n...");
      int n=shub.nextInt();

      System.out.println("Number of digits in "+n+" are --> "+countD(n));
   }
}