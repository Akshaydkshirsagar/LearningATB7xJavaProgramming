package Ex_17082024;

public class Lab004 {

    public static void main(String[] args) {
        A a = new A();    // sib load one time only
        a.age=55;
        System.out.println(A.dis);
        A.m1();
        int i=a.m2();
        System.out.println(i);
        A a1 =new A();    // iib called for every object


    }
}
    class A {
        //SIB
        static {
            System.out.println("Static initialization block");
        }

        //IIB
        {
            System.out.println("Instance initialization block");

        }

        int age = 23;
        static int dis = 50;

        static void m1() {
            System.out.println("Static method m1");
        }

        int m2() {
            System.out.println("instance method m2");
            int a=5, b=-66;
            return a+b;
        }

    }
