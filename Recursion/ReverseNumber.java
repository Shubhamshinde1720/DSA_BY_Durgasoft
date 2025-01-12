import java.util.*;

class ReverseNumber{

   static int reverse(int n, int len){

      if(len==0){
         return 0;
      }else{
         return ((n%10)*(int)Math.pow(10,len-1))+reverse(n/10,--len);
      }

   }


   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter value of n...");
      int n=shub.nextInt();
      String s=Integer.toString(n);
      int len=s.length();

      System.out.println(n+" Revrse ==> "+reverse(n,len));




   }
}