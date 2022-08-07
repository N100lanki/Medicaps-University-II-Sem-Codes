import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class iniatialize{
    float x,y;
    void getvalue(float x ,float y){
        this.x=x;
        this.y=y;
        System.out.println("Values initilize successfull (super class) :");
    }
}
class addition extends iniatialize{
void Add(){
System.out.println("Performing addition (in sub class of Initialize class)"+(this.x+this.y));
}
}
class multiplication extends addition{
    void Multiply(){
        System.out.println("Performing multilication (in sub class of addition): "+(this.x*this.y));

    }
}
public class A21MultilevelInheritance {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers :");
    float x = sc.nextFloat();
    float y = sc.nextFloat();
    multiplication obj = new multiplication();
    obj.getvalue(x,y);
    obj.Add();
    obj.Multiply();
    
}
}
