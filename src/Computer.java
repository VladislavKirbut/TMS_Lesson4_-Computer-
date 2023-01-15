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
    private double volume;

    public RAM() {
        this.name = "Kingston Fury Beast DDR4";
        this.volume = 4;
    }

    public RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String toString() {
        return "RAM name: " + name + "\nRAM volume: " + volume;
    }
}

class HDD {
    private String name;
    private double volume;
    private String type;

    public HDD(String name, double volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public HDD() {
        this.name = "Toshiba DT01ACA";
        this.volume = 500;
        this.type = "internal"; // internal || external
    }

    public String toString() {
        return "HDD name: " + name + "\nHDD volume: " + volume + "\nHDD type: " + type;
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