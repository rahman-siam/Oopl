package Oop_Exam;

public class Encapculation2 {
  private int a,b;
    
     public void setA(int a,int b) {
        this.a = a;
        this.b=b;
    }

     public int getA() {
        return a*b;
    }

    public static void main(String[] args) {
        Encapculation2 ob = new Encapculation2(); 
        ob.setA(97,90);
        System.out.println(ob.getA());
}
}
