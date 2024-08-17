package Ex_17082024;

public class Lab001 {
        //Wrapper class
    /* wrapper class is a class whose object wraps or contains primitive data type
    They convert primitive data types into objects
    Use- data structure in collection framework
     */
        public static void main(String[] args) {
            int a=10;
            Integer b=a;          // primitive to wrapper conversion
            System.out.println(a);
            System.out.println(b);  // now a has multiple functions


            Integer i=22;      //wrapper to primitive  auto boxing
            int c=i;             // unboxing
            System.out.println(i);
            System.out.printf("%d",c);
        }


}
