public class A17MOverLoadingAreas {
    void area(float r){
        System.out.println("Area of circle= "+(3.14*r*r));
    
    }
    void area(float b,float h){
        System.out.println("Area of tringle"+(b*h));

    }
    void area(Float l ,float w){
        System.out.println("Area of Rectangle :"+(l*w));
    }
public static void main(String [] X){
    float r = 10;
    float b = 10,h=20;
    float l=5,w=8;
    A17MOverLoadingAreas ob = new  A17MOverLoadingAreas();
    ob.area(r);
    ob.area(b,h);
    ob.area(l,w);
    

}
    
}
