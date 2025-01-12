import java.util.*;

class MaximumOf2{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter vlaue of b");
      int b=shub.nextInt();


      System.out.println("Logic-1: Conditional operator");

      System.out.println( (a>b)?"a is maximum ="+a:"b is maximum ="+b);

      System.out.println("Logic-2: Math.max(a,b)");

      System.out.println("Maximum is : "+Math.max(a,b));
   }
}