import java.util.*;

class EvenOdd{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter a number ");
      int n=shub.nextInt();

      if(n%2==0){
         System.out.println(n+" is a EVEN number");
      }else{
         System.out.println(n+" is a ODD number");
      }
   }
}