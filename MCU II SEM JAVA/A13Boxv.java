import java.util.Scanner;
 class Box{
	     int a,b,c;
	     //creating a parameterize constructor for initializing the value     
	     Box(int x)
	     {
	    	 a=x;
	     }
	     Box(int x,int y,int z)
	     {
	    	 a=x;
	    	 b=y;
	    	 c=z;
	     }
	     int cube()
	     {
	    	 System.out.println("Volume of cube :"+(a*a*a));
	          return 0;
	     }
	     int cuboid()
	     {
	    	 System.out.println("Volume of cuboid:"+ (a*b*c));
	          return 0;
	     }
		}


   class A13Boxv{
	   public static void main(String [] args) {
		   Scanner  sc=new Scanner(System.in);
		    System.out.println("enter the value of x,y,z");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			Box b1= new Box(x);
			Box b2= new Box(x,y,z);
		   b1.cube();
		   b2.cuboid();
	   }
   }
