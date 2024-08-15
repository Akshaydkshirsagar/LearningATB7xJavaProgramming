package Ex_13072024;
import java.util.Scanner;
public class Lab007 {

    // use of Escape characters

    public static void main(String[] args) {
        char c='\n';    //new linr
        char c1='\t';   //add tab
        char c2='\b';  // delete 1 char from word
        char c3='\r';   // delete 1 word

         // System.out.println("Akshay"+c+"Kshirsagar");
        //System.out.println("Akshay"+c1+"Kshirsagar");
        //System.out.println("Akshay"+c2+"Kshirsagar");
        //System.out.println("Akshay"+c3+"Kshirsagar");

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String firstName= sc.next();

        System.out.println("Enter last first name:");
        String lastName= sc.next();

        System.out.println(firstName+c1+lastName);




    }
}
