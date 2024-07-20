package Ex_20072024;
import java.util.Scanner;
public class Hw_FizzBuzz_Test {
   /* Write a program that prints numbers from 1 to 100. However, for multiples of 3,
    print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
    For numbers that are multiples of both 3 and 5, print "FizzBuzz."
    */
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your number: ");
       int a= sc.nextInt();

        if (a % 3 == 0 && a % 5 != 0) {
               System.out.println("Fizz");
           } else if (a % 5 == 0 && a % 3 != 0) {
               System.out.println("Buzz");
           } else if (a % 3 == 0 && a % 5 == 0) {
               System.out.println("FizzBuzz");
           }

   }


}
