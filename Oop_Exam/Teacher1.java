package Oop_Exam;

public class Teacher1 {
  int id,phone;
  String name;

  void set(int i,int p,String n){
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
    Teacher1 ob1=new Teacher1();
    ob1.set(89, 49848547, "Abdur Rahman");
    ob1.display();
    Teacher1 ob2=new Teacher1();
    ob2.set(89, 49847, "Abadur mavn");
    ob2.display();
  }
}

