package Ex_070724;
import java.util.Scanner;
public class Lab088 {
    public static void main(String[] args) {
        // program to find max of two numbers given by user
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 1 : ");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("Number1 is Max");
        }
        else{
            System.out.println("Number2 is Max");
        }

    }
}
