//package out.production.inheritance;

class Vehicle {

    //instance variables
    public int wheel = 10;
    public String colour = "red";


    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }

    public Vehicle(int w, String c){
        this.wheel = w;
        this.colour = c;
        System.out.println("Parent param Constructor ");
    }


    public void displayVehicle() {
        System.out.println("parent "+this.wheel + " "+this.colour );
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}

class Car extends Vehicle {

    String name = "KIA";

    public Car() {
        System.out.println("Car Constructor");
    }

    public Car(int wheel, String colour, String n) {
        super(wheel, colour);

        this.name = n;
        System.out.println("Child Param Constructor " + this.name);
    }

    public void display() {
        System.out.println("child ");
    }

    public void displayCar() {
        System.out.println("child car");
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}


public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4,"blue");
        System.out.println(v);

        Car c = new Car(4, "green", "Maruti");
        System.out.println(c);

        c.displayVehicle();
        c.displayCar();

        v.displayVehicle();

        Auto a = new Auto(4, "yellow");
        System.out.println(a);

    }
}


class Auto extends Vehicle {

    public Auto(){
        System.out.println("Auto Constructor");
    }

    public Auto(int wheel, String colour){
        super(wheel, colour);
        System.out.println("Child Param Constructor Auto ");
    }

    public static void printAuto(){
        System.out.println("print auto");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "wheel=" + wheel +
                ", colour='" + colour + '\'' +
                '}';
    }
}