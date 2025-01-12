import java.util.*;

class Factorial{

static int fact(int n){
   if(n==1){
      return 1;
   }else{
      return n*fact(--n);
   }
}

   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n");
      int n=shub.nextInt();

      System.out.print("factoreal of "+n+" is = "+fact(n));
   }


}