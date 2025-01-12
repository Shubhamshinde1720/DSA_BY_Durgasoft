import java.util.*;

class Tribonacci{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n");
      int n=shub.nextInt();


      ArrayList<Integer> al=new ArrayList<Integer>();

      int a=0;
      int b=1;
      int c=2;

      al.add(a);
      al.add(b);
      al.add(c);

      for(int i=0;i<n-3;i++){
         int d=a+b+c;
         al.add(d);
         a=b;
         b=c;
         c=d;
      }

System.out.println("==============================");
      System.out.println(al);

   }
}