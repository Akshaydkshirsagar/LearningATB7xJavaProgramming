package Ex_13072024;

import java.sql.SQLOutput;

public class Lab011 {
    // Logical operators

    public static void main(String[] args) {
        int x=50;

        System.out.println("Logical AND");
        System.out.println(x>70 && x<90);
        System.out.println(x>20 && x<90);

        System.out.println("Logical OR");
        System.out.println(x>30 || x<1);
        System.out.println(x>80 || x<1);

        System.out.println("logical NOT");
        System.out.println(!(x>30 || x<1));
        System.out.println(!(x>333));


    }
}
