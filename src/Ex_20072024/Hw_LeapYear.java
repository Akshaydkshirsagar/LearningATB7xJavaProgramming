package Ex_20072024;
import java.util.Scanner;
public class Hw_LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        int year= sc.nextInt();

        if (year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
