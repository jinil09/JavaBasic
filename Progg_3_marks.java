//Write a programe to take 3 values from user and find addition and avarage of this 3 values and grade them like if avg marks >90 Then A. between 80 to 90 then B . between 70 to 80 then C and Other wise D.

import java.util.*;

public class Progg_3_marks {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Subject Marks :");
        int m1 = scn.nextInt();
        System.out.print("Enter Second Subject Marks :");
        int m2 = scn.nextInt();
        System.out.print("Enter Third39 Subject Marks :");
        int m3 = scn.nextInt();

        int total = m1+m2+m3;
        int avg = total/3;

        System.out.println("Total marks is :" +total);
        System.out.println("Total avg marks is :" +avg);

        if(avg>90){
            System.out.println("Congrates You have A grade");
        }
        else if(80<avg && avg<90){
            System.out.println("Congrates You have B grade");
        }

        else if(70<avg && avg<80){
            System.out.println("You have c grade");
        }

        else{
            System.out.println("You have D Grede");
        }
    }
}
