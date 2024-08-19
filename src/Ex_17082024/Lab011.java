package Ex_17082024;

public class Lab011 {
    public static void main(String[] args) {
        String ip= args[0];
        System.out.println("argument value is "+ip);

        int a = Integer.parseInt(ip);
        int b= 1000/a;
        System.out.println(b);

        // if we pass no value ArrayIndexOutOfBoundsException
        // if we pass string NumberFormatException
        // if we pass 0 ArithmeticException


        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Called
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLI
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.  G


    }
}
