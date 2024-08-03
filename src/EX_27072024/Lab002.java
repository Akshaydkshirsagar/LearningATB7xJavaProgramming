package EX_27072024;

import javax.swing.*;
import java.util.Scanner;
public class Lab002 {
    //Another way to create array

    public static void main(String[] args) {
        int [] marks = new int [5];    //length=5

        System.out.println(marks[0]);  // default values are 0
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        marks[0]=55;
        marks[1]=75;
        marks[2]=99;
        marks[3]=33;
        Scanner sc= new Scanner(System.in);   // array input using Scanner
        System.out.print("Enter array element 4 : ");
        marks[4]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);




    }
}
