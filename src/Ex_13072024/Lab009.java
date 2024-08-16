package Ex_13072024;

public class Lab009 {

    // Assignment operators

    public static void main(String[] args) {

        int a=100;
        int b=50;

        a +=20;
        System.out.println(a);

        b-=30;
        System.out.println(b);

        a *=2;        // a=120
        System.out.println(a);

        b /=5;     //b=20;
        System.out.println(b);

        int c=99;
        c %=10;
        System.out.println(c);

        int x = 5;     // binary 5 is 101
        x &= 3;        // binary 3 is  011
        //   101
        //   011   AND
        //   001  decimal is 1
        System.out.println(x);

        int y=5;        //101
        y |=3;         // 011  OR
                       // 111  =7 decimal
        System.out.println(y);

        int z=5;       // 101
            z^=3;      // 011  XOR      bit same=0; bit different=1
                       // 110   == 6

        System.out.println(z);

    }
}
