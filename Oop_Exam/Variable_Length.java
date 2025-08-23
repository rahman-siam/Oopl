package Oop_Exam;

public class Variable_Length {
  int sum=0;
  void method(int...a){
     for(int i:a){
      sum+=i;
     }
     System.out.println("Sum is: "+sum);
  }
  
  public static void main(String[] args) {
    Variable_Length ob = new Variable_Length();
        ob.method(10,20);
        ob.method(5,7,20);
        ob.method(10,20,3,4);
        ob.method(5);

    
  }
}
