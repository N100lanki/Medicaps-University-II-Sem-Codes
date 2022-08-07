//Make a class box and find volume of box

class Box {
int a,b,c;
Box(int x){
    a=x;
}    
Box(int x, int y ,int z){
    a=x;
    b=y;
    c=z;
}
int cube(){
    System.out.println("Volum of cube is :"+(a*a*a));
    return 0;
}
int cuboid(){
    System.out.println("volum of cuboidd :"+(a*b*c));
    return 0;
}
}
class Voluem{
    public static void main(String [] args)
    {
        Box b1 = new Box(10);
        Box b2 = new Box(10,20,30);
        b1.cube();
        b2.cuboid();
    }
}
