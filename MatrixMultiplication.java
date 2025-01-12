import java.util.*;

class MatrixMultiplication{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);

      int[][] a=new int[2][2];
      int[][] b=new int[2][2];

System.out.println("Enter total 9 elements of matrix a...");
      for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
            a[i][j]=shub.nextInt();
         }
      }

      System.out.println("Matrix  a is following below");
      for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
            System.out.print(a[i][j]+" ");
         }
         System.out.println();
      }


      System.out.println("Enter total 9 elements of matrix b....");

      for(int i=0;i<b.length;i++){
         for(int j=0;j<b.length;j++){
            b[i][j]=shub.nextInt();
         }
      }

      System.out.println("Elements of matrix b are following below");
      for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
            System.out.print(b[i][j]+" ");
         }
         System.out.println();
      }


      System.out.println("MULTIPLICATION OF MATRIX A AND MATRIX B IS");

      int[][] c=new int[2][2];
      for(int i=0;i<a.length;i++){
         for(int j=0;j<b.length;j++){
             c[i][j]=0;
            for(int k=0;k<c.length;k++){
               c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
            }
         }
      }


      System.out.println("Multiplication matrix C ...Elements of matrix c are following below");
      for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
            System.out.print(c[i][j]+" ");
         }
         System.out.println();
      }

   }
}