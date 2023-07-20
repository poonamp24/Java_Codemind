class Vehical {
    private String model;
    private String name;
    private int year;
    private String color;

    public Vehical(String model, String name, int year, String color) {
        super();
        this.model = model;
        this.name = name;
        this.year = year;
        this.color = color;
    }

    void showVehical() {
        System.out.println("Model is = " + model);
        System.out.println("Name is = " + name);
        System.out.println("Year is = " + year);
        System.out.println("Color is = " + color);
    }
}

class Car extends Vehical {

    int Wheels;

    public Car(String model, String name, int year, String color, int Wheels) {
        super(model, name, year, color);
        this.Wheels = Wheels;
    }

    void carShow() {
        showVehical();
        System.out.println("Wheels are = " + Wheels);
    }
}

class MotorCycle extends Vehical {

    private int Wheels;

    public MotorCycle(String model, String name, int year, String color, int Wheels) {
        super(model, name, year, color);
        this.Wheels = Wheels;
    }

    void MotorShow() {
        showVehical();
        System.out.println("Wheels are = " + Wheels);
    }
}

public class HierarchicalInheritanceEx {
    public static void main(String[] args) {
        Car c = new Car("XYZ", "TATA Nexon", 2014, "Black", 4);
        c.showVehical();
        MotorCycle m = new MotorCycle("ABC", "Yamaha", 2010, "Red", 2);

        m.showVehical();
    }
}
