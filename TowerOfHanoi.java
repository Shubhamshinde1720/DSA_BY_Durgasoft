import java.util.*;

class TowerOfHanoi{
    
   public static void diskMoves(int n,String src, String helper, String dest){
      if(n==1){
         System.out.println("Move Disk "+n+" from "+src+" to "+dest);
      }else{
         diskMoves(n-1,src,dest,helper);
         System.out.println("Move Disk "+n+" from "+src+" to "+dest);
         diskMoves(n-1, helper,src,dest);
      }
   }
   

   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      System.out.println("Enter number of disks..");
      int n=shub.nextInt();


      diskMoves(n,"src","helper","dest");
   }
}