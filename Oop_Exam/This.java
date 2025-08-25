package Oop_Exam;

public class This {
   int sum=0;

   void m(){
    sum++;
    System.out.println("Sum is: "+sum);
  }

  public static void main(String[] args) {
    This Test=new This();
    Test.m();
    Test.m();
    Test.m();

  }
}


