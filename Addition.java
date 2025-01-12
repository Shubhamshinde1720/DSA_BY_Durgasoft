class Demo{
   static int add(int a, int b){
      int c;
      c=a+b;
      return c;
   }
}

class Addition{
   public static void main(String[] args){
      System.out.println(Demo.add(1,3));
      System.out.println(Demo.add(4,4));
      System.out.println(Demo.add(5,2));
   }
}