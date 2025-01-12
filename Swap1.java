import java.util.*;

class Swap1{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();


      System.out.println("value of a after swap is a="+a);
      System.out.println("value of b after swap is b="+b);

      System.out.println("===================================");
      int temp=a;
      a=b;
      b=temp;

      System.out.println("value of a before swap is  a = "+a);
      System.out.println("value of b before swap is  b = "+b);



   }
}