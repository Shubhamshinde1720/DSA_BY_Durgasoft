import java.util.*;

class Swap2{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=shub.nextInt();
      System.out.println("Enter value of b");
      int b=shub.nextInt();


      System.out.println("value of a after swap is a="+a);
      System.out.println("value of b after swap is b="+b);

      System.out.println("===================================");
        
         a=a+b;
         b=a-b;
         a=a-b;

      System.out.println("value of a before swap is  a = "+a);
      System.out.println("value of b before swap is  b = "+b);



   }
}