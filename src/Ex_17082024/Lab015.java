package Ex_17082024;

public class Lab015 {
    public static void main(String[] args) {
        System.out.println("Start of program");
        int b= 0;
        try {
            String ip=args[0];
            int a= Integer.parseInt(ip);
            b = 1000/a;
        } catch (Exception e) {
            System.out.println("there is some problem!");
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("END of program");
    }
}


