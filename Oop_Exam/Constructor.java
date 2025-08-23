package Oop_Exam;

public class Constructor {
  int id,phone;
  String name;

  Constructor(String n,int p,int i){

    id=i;
    phone=p;
    name=n;
  }
   void display(){
      System.out.println("Name is: "+name);
      System.out.println("Id is: "+id);
      System.out.println("Phone is: "+phone);
    }
  public static void main(String[] args) {
    Constructor ob1=new Constructor("Fahmidur Rahman Siam",900903003,8);
    Constructor ob2=new Constructor("midur man am",900903003,8);
    ob1.display();
    ob2.display();
  }
}
