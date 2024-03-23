package out.production.Class.Object;

import java.util.Objects;

class Vehicle {

    // instance variable
    int wheel = 0;
    String colour = "red";

    // class variable
    static String type;

    // constructor
    Vehicle(int w, String c){
        this.wheel = w;
        this.colour = c;
    }

    // instance method
    public void print(){
        System.out.println("Instance Method");
    }

    // class method
    public static void printStatic(){
        System.out.println("Static Method");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "  ** wheel=" + wheel +
                ", ** colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheel == vehicle.wheel && colour.equals(vehicle.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, colour);
    }

    static{
        System.out.println("static block 1");
    }
}

public class Test{

    static{
        System.out.println("static block 2");
    }

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle(4,"red");

        Vehicle v2 = new Vehicle(4,"red");

        System.out.println("v1 is "+v1);
        v1.print();


        System.out.println("v2 is "+v2);
        v2.print();

        Vehicle.type = "vehicle";
        Vehicle.printStatic();


       System.out.println(" v1 = v2 "+(v1 == v2));
       System.out.println(" v1 eq v2 "+(v1.equals(v2)));
    }
}
