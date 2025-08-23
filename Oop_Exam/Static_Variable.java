package Oop_Exam;

public class Static_Variable {
  int id;
  long phone;
  String name;
  static String varsity="DIU";
  
  // constructor method.
  Static_Variable(int i,long p,String n){
    id=i;
    phone=p;
    name=n;
  }

  void display(){
      System.out.println("Name is: "+name);
      System.out.println("Id is: "+id);
      System.out.println("Phone is: "+phone);
      System.out.println("Varsity is: "+varsity);
      System.out.println("\n\n");
    }
    public static void main(String[] args) {
      Static_Variable ob1=new Static_Variable(8, 94747478909040l, "flak");
      Static_Variable ob2=new Static_Variable(9, 94747478909040l, "Siam");
      Static_Variable ob3=new Static_Variable(10, 947474598785478l, "fuehm");

      ob1.display();
      ob2.display();
      ob3.display();;
    }

}
