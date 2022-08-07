public class minmaxarry {
    int max(int a[]){
        int max=0 ;
        for (int i =0 ;i<a.length;i++){
            if (max<=a[i]){
                max=a[i];
            }
        }
        return max ;

    }
    int min(int a[]){
        int min=a[0];
        for (int i =0 ;i<a.length;i++){
            if (min>a[i]){
                min=a[i];

            }
        }
        return  min;
    }
    public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7,8,9,5,6,5,2};
    minmaxarry ob = new minmaxarry();
    System.out.println("Minium In the arry is "+ob.min(a));
    System.out.println("Minium In the arry is "+ob.max(a));
}
}