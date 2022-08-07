//package com.company;
 import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;
  public class JavaUserInput {
       public static void main(String[] args) {
            System.out.println("Taking Int Input From the User");
            Scanner si = new Scanner(System.in);
            System.out.println("Enter number 1");
            int a = si.nextInt(); //
            System.out.println("Enter number 2");
            int b = si.nextInt(); 
                   int sum = a +b;
                   System.out.println("Taking float Input From the User");
                   Scanner sf = new Scanner(System.in);
                   float c = sf.nextFloat();
                   float d = sf.nextFloat(); 
                   float add = c +d; 
                    
                     System.out.print("The sum of these int numbers is");
                     System.out.println(sum);
                     System.out.print("Addition of two float=");
                     System.out.println(add);
                     System.out.print("The numbers is int or not!!");
                       boolean b1 = si.hasNextInt();
                        System.out.println(b1);
                        Scanner ss= new Scanner(System.in);
                        System.out.print("Enter String");
                        String str = ss.next();
                        System.out.println(str);
                        System.out.print("Enter String");
                         String str1 = ss.nextLine();
                         String str2 = ss.nextLine();
                         System.out.print(str2);
                           
                    } 
                    }
