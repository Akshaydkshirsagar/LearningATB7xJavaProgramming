package Ex_20072024;
import java.util.Scanner;
public class Lab086 {
    public static void main(String[] args) {
        // Program for identify odd / even number
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();

        if (number%2==0){
            System.out.println("Your number is Even");
        }
        else{
            System.out.println("Your number is Odd");
        }


    }
}
