package Oop_Exam;

public class Encapsulation {
  private int a;

  public void setA(int a){
        this.a=a;
  }

  public int getA(){
    return a;
  }

 public static void main(String[] args) {
  Encapsulation ob=new Encapsulation();
  ob.setA(89);
  System.out.println(ob.getA());
 }
  
}