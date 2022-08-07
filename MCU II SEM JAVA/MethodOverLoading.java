public class MethodOverLoading {

static void foo(){
    System.out.println("Good Evening Ninjan");
}
static void foo(int x ,int y){
    int z =x+y;
    System.out.println(z);
}
static void foo(int a,int b,int c){
    int d = a + b + c;
    System.out.println(d);
}
    public static void main(String [] A) {
    int a=100,b=100,c=100;
    
    foo();
    foo(a,b);
    foo(a,b,c);
    
}    
}
