package Ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab012 {
    public static void main(String[] args) {

        // Exceptions

        //Chaecked - JVM knows

        /* try {
            FileInputStream file = new FileInputStream("c://log.txt") ; //Jvm Cant find dile
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);   // u can give your message also
        }
        */

        try {
            FileInputStream f = new FileInputStream("c://bugreprot");
        }
        catch(Exception e){
            System.out.println("Unable to find file");
        }


        //Unchecked exception

        try {
            int a = 500;
            int c = a / 0;
        }
        catch(ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
