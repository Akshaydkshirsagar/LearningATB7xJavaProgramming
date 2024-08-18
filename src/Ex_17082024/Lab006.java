package Ex_17082024;

public class Lab006 {
    //Concept of inner class /nested class
    public static void main(String[] args) {
        OuterClass oc =new OuterClass();
        oc.m1();

        //Inner class object creation
        OuterClass.InnerClass ic= oc.new InnerClass();
        ic.m2(); // now

    }
}

class OuterClass{
    static Integer a=22;
           Character c='A';
           void m1(){
               System.out.println("Outer calsss method m1");
           }
     class InnerClass{

       void m2 (){
           System.out.println("Inner calss method m2");
          System.out.println(c);
            System.out.println(a);  // inner class can access a outer class
        }
    }
}