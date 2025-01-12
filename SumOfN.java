import java.util.*;

class SumOfN{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n");
      int n=shub.nextInt();


      System.out.println("Logic-1: Loops");
      int sum=0;
      for(int i=1;i<=n;i++){
         sum+=i;
      }

      System.out.println("Sum of "+n+" numbers is "+sum);

            System.out.println("==============================");
      System.out.println("Logic-2: Math Formula");
      
        int x=n*(n+1)/2;
      System.out.println("Sum of "+n+" numbers is "+x);


      System.out.println("==============================");
      System.out.println("Logic-3: Recursion");

            System.out.println("Sum of "+n+" numbers is "+sumOfN(n));


   }

   static int sumOfN(int n){
      if(n==1){
         return 1;
      }else{
         return n+sumOfN(n-1);
      }
   }
}