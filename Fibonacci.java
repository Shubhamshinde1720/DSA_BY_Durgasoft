import java.util.*;

class Fibonacci{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n");
      int n=shub.nextInt();

      ArrayList<Integer> al=new ArrayList<Integer>();

      int a,b,c,i;

      a=0;
      b=1;

      al.add(a);
      al.add(b);

      for(i=0;i<n-2;i++){
         c=a+b;
         al.add(c);
         a=b;
         b=c;
      }

      System.out.println(al);

   }
}