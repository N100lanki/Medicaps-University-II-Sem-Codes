//18. Make a class box having three member variables width, height and depth using constructor  overloading and parameterized constructor .
class Box {
    double width;
    double height;
    double depth;
    Box (){
      width =10;
      height =20;
      depth =30;
      System.out.println("Default Constructor :");
      System.out.println("Volume of cube :"+(width*depth*height));
    }
   
    // This is the constructor for Box.
    Box(double w, double h, double d) {
      System.out.println("Perameterzi Constructor :");
      width = w;
      height = h;
      depth = d;
      System.out.println("width="+width);
      System.out.println("depth="+depth);
      System.out.println("height="+height);

    }
  
   
   
    // compute and return volume
    double volume() {
      return width * height * depth;
    }
  }
public class  A18ConstructorOverLoading {
  public static void main(String args[]) {
    // declare, allocate, and initialize Box objects
    Box mybox1 = new Box(10, 20, 15);
 
    double vol;
 
    // get volume of first box
    vol = mybox1.volume();
    System.out.println("Volume is " + vol);
 
    // get volume of second box
    Box mybox2 = new Box();
    vol = mybox2.volume();
    System.out.println("Volume is " + vol);
  }
}



   