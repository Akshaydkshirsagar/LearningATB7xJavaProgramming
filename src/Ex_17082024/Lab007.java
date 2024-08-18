package Ex_17082024;

public class Lab007 {
      // Inner classes are used as shield
    public static void main(String[] args) {
        Car c= new Car("RR");
        c.drive();
        // c.gb();  cant access inner class method
        // to access inner class method create a inner class object
        Car.GearBox g= c.new GearBox();
        g.gb();
        // g.nb();
        // To access 2nd inner class method
        Car.GearBox.NutBolt n = g.new NutBolt();
        n.nb();
    }
}

class Car{
      String make;

    public Car(String make){
        this.make=make;
    }

    void drive(){
        System.out.println("Driver method of car");
    }

    class GearBox{
        void gb(){
            System.out.println("method for gerabox");
        }
        class NutBolt{
            void nb() {
                System.out.println("Gear Box Nutbolt Method");
            }
        }
    }
}