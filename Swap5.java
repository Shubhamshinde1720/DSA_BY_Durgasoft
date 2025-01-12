import java.util.*;
class Swap5{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();


      System.out.println("Values before swapping are  a="+a+"--- b="+b);

      a= a+b - (b=a);
      System.out.println("Values after swapping are  a="+a+"--- b="+b);
   }
}