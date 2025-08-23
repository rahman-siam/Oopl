package Oop_Exam;

public class Box {
  double height, width, depth;

  Box(double h,double w,double d){
    height=h;
    width=w;
    depth=d;
  }

  void Displayvol(){
    System.out.println("Box capabilities: "+(height*width*depth));
  }

}
