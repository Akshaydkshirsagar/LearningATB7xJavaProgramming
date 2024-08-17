package Ex_17082024;

public class Lab003 {
    public static void main(String[] args) {
        Double d=3.445;     //stored in heap
        double d2=d;        // stored in continuous memory
        double d1=d.doubleValue(); // continuous memory
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);

        String s="Akshay";     //scp
        String s2 = new String("Akshay");  //heap




    }
}
