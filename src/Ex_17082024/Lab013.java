package Ex_17082024;

public class Lab013 {
    public static void main(String[] args) {


        String ip= null;  //ArrayIndexOutOfBoundsException

        try {
            ip=args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

        int a=0;     //NumberFormatException
        try {
            a=Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        int b=0;   //ArithmeticException

        try {
            b=1000/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);

            ///!!!!!!!!BAD CODE!!!!!!!!!!!!!
        }
    }
}
