package Ex_20072024;
import java.util.Scanner;

public class Hw_Triangle_Classifier {
    /* Write a program that classifies a triangle based on its side lengths.
 Given three input values representing the lengths of the sides, determine
 if the triangle is equilateral (all sides are equal),
 isosceles (exactly two sides are equal), or
 scalene (no sides are equal).
 Use an if-else statement to classify the triangle.
 side1, side2, side3 ->
*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of side 1 is :");
        float side1= sc.nextFloat();

        System.out.println("Length of side 2 is :");
        float side2= sc.nextFloat();

        System.out.println("Length of side 3 is :");
        float side3= sc.nextFloat();

        if (side1 == side2 && side2==side3 ){
            System.out.println("Triangle is Equilateral");
        }
        else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("triangle is Isosceles");
        }
        else{
            System.out.println("Triangle is scalene");
        }

        }

}
