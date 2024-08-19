package Ex_17082024;

public class Lab017 {
    public static void main(String[] args) {

        int a=0;

      /*  try {
            int b= 44/a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
        }
        */


        try {
            int c=0/0;
        } catch (Exception ak) {
            System.out.println(ak.getMessage());
        }

    }
}
