package Oop_Exam;

public class This {
  static int sum=0;

  static void m(){
    sum++;
    System.out.println("Sum is: "+sum);
  }

  public static void main(String[] args) {
    This.m();
    This.m();
    This.m();
  }
}


