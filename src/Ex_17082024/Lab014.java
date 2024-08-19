package Ex_17082024;

import org.w3c.dom.ls.LSOutput;

public class Lab014 {
    public static void main(String[] args) {
        System.out.println("Start of program");
        int b= 0;
        try {
            String ip=args[0];
            int a= Integer.parseInt(ip);
            b = 1000/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("END of program");
    }
}
