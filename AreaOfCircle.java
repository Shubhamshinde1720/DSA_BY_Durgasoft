import java.util.*;

class AreaOfCircle{
   public static void main(String[] args){
      System.out.println("Enter radius of circle");
      Scanner shub=new Scanner(System.in);
      int radius =shub.nextInt();


      System.out.println("Area of circle which radius is = "+radius+" is ---> "+areaOfCircle(radius));

   }

   static double areaOfCircle(int rad){
      return 3.147*rad*rad;
   }
}