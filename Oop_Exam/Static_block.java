package Oop_Exam;

public class Static_block {
  static int a,b;
  
    static{
      a=56;
      b=67;
    }
  
  public static void main(String[] args) {
    System.out.println(a+b);
  }
  
}
