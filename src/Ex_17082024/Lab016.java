package Ex_17082024;

public class Lab016 {
    public static void main(String[] args) {
        final double pi=3.14;
        int a=0;
        int b= 0;
        try {
            b = 100/a;
        } catch (Exception e) {
            System.out.println("/ by 0");;
        } finally {
            System.out.println("I will be executed anyhow");
        }
        System.out.println(b);
    }
}
