public class VarArg {
    static int sum(int ...arr){
        int c=0;
        for(int a :arr){
            c+=a;
        }
        return c;

    } 
    public static void main(String [] A)
    {

        System.out.println("Sum of The Variable"+ sum(...arr));
    }
    
}
