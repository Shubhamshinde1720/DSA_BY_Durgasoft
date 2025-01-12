import java.util.*;

class MaximumOf3{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter vlaue of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();
      System.out.println("Enter value of c");
      int c=shub.nextInt();


System.out.println("=============================");
      System.out.println("Logic 1: Conditional Operator");
      System.out.print("Maximum of a, b, and c is : ");
      System.out.println((a>b&&a>c)?a:(b>c)?b:c);


      System.out.println("=============================");
      System.out.println("Logic 2: Math.max(a,Math.max(b,c)) Operator");

      System.out.println("Maximum of a, b, and c is : "+Math.max(a,Math.max(b,c)));
            System.out.println("=============================");

   }
}