package Ex_17082024;

public class Lab005 {
    public static void main(String[] args) {
        Abc a = new Abc();
        A a2 = new A();

        a.age =  12;
        System.out.println(Abc.discount);
        a.m2();
        A.m1(); // Static

        // Static don't need object ref. - True

    }
}



class Abc{
    int age  = 10; // Instance variable
    static int discount = 199; // static variable

    // SIB - STATIC initialization block
    static {
        System.out.println("One Time Load SIB");
    }

    // IIB - instance initialization block
    {
        System.out.println("IIB When Object is created");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}
