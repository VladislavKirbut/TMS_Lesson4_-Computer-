public class Computer {
    private double cost;
    private String model;

    private RAM ram;
    private HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this(cost, model);
        this.ram = ram;
        this.hdd = hdd;
    }

    public void showInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Computer cost: " + cost + "\nComputer model: " + model + "\n" + ram + "\n" + hdd;
    }
}

class RAM {
    private String name;
    private double value;

    public RAM() {
        this.name = "Kingston Fury Beast DDR4";
        this.value = 4;
    }

    public RAM(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return "RAM name: " + name + "\nRAM value: " + value;
    }
}

class HDD {
    private String name;
    private double value;
    private String type;

    public HDD(String name, double value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public HDD() {
        this.name = "Toshiba DT01ACA";
        this.value = 500;
        this.type = "internal"; // internal || external
    }

    public String toString() {
        return "HDD name: " + name + "\nHDD value: " + value + "\nHDD type: " + type;
    }
}

class ComputerTest {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2000, "ASUS ROG Strix");
        comp1.showInfo();
        System.out.println();

        RAM ram = new RAM("DDR4",32);
        HDD hdd = new HDD("Kingston SXS2000", 2000, "internal");

        Computer comp2 = new Computer(100000, "HAF Powered by ASUS TUF Gaming 10", ram, hdd);
        comp2.showInfo();
    }
}