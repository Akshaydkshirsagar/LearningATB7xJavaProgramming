package EX_27072024;
import java.util.Scanner;
public class Lab006 {
    // write a program where take user input of 5 sub marks and find avg

    public static void main(String[] args) {
        // logic input float, scanner

        float[] marks=new float[5];

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter of 1 sub: ");
        marks[0]=sc.nextInt();
        System.out.println("Enter of 2 sub: ");
        marks[1]=sc.nextInt();
        System.out.println("Enter of 3 sub: ");
        marks[2]=sc.nextInt();
        System.out.println("Enter of 4 sub: ");
        marks[3]=sc.nextInt();
        System.out.println("Enter of 5 sub: ");
        marks[4]=sc.nextInt(); ...................repetitive code
        */
        for (int i=0; i<marks.length; i++) {
            System.out.print("Enter marks of sub " + (i+1)+ ":");
            marks[i]=sc.nextFloat();
        }
        float avg= (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) /5;
        System.out.println("Average marks obtained are "+avg );
        sc.close();
    }
}
