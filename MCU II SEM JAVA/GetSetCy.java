import java.util.Scanner;

class cylinder{
    private int radius ;
    private int height ;
    public int getHeight() {
        return height;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    void Volum(){
        float volume=(radius*radius*height);
        System.out.println("Volum ="+Math.PI*volume);
    }

    

}
public class GetSetCy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius :");
        int radius;
        try{
         radius=sc.nextInt();
        }
        catch (Exception E){
            System.out.println("Please enter an integer");
        }
        System.out.println("Enter the height:");
        int height=sc.nextInt();
        cylinder obj = new cylinder();
        obj.setHeight(height);
        obj.setRadius(radius);
        obj.Volum();
//System.out.println(obj.getHeight());
//System.out.println(obj.getRadius());
    }
    
}
