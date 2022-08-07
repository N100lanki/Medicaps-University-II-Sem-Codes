import java.util.Scanner;
class Marks{
    int RollNo;
    float SEP,TOC,AFM,PY,JAVA,CNF;
    String Name = new String();
     void GetData(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Name :");
         Name=sc.next();
         System.out.println("Enter RollNo.");
         RollNo=sc.nextInt();
         System.out.println("Enter Marks Of SEP");
         SEP=sc.nextFloat();
         System.out.println("Enter Marks Of CNF");
         CNF=sc.nextFloat();
         System.out.println("Enter Marks Of AFM");
         AFM=sc.nextFloat();
         System.out.println("Enter Marks Of PY");
         PY=sc.nextFloat();
         System.out.println("Enter Marks Of Java");
         JAVA=sc.nextFloat();
         System.out.println("Enter Marks Of TOC");
         TOC=sc.nextFloat();
    }
}
class Total extends Marks {
    float total,percentage;
    void total(){
         total=(SEP+TOC+CNF+PY+JAVA+AFM);
        System.out.println(("Total = "+total));
    }
    void percent(){
        percentage=(total*100)/240;
        System.out.println("Percentage="+percentage);

    }

}
class G extends Total{
    void gradeDisplay(){
        if (percentage>=60)
            System.out.println(" Grade A");
        if (percentage >=45 && percentage <=59 )
            System.out.println("Grade B");
        if (percentage<=44 && percentage>=40)
            System.out.println("Grade C");
        if (percentage < 35)
            System.out.println("Grade D");
        
}

}

public class MarksClass {
    public static void main(String[] args) {
        G obj = new G();
        obj.GetData();
        obj.total();
        obj.percent();
        obj.gradeDisplay();
    }

    }

