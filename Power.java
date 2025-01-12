import java.util.*;


class Power{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();

      System.out.println(power(a,b));

   }

   static int power(int a,int b){
      if(b==0){
         return 1;
      }else{
         return a*power(a,--b);
      }
   }
}