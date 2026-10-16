package Oop.Inheritance.practice1;

public class index {
    public static void main(String[] args) {
        VehicalManager manager = new VehicalManager();

        manager.addVehicle(new Car("Mecidex0", "C-class", 2013, 7));
        manager.addVehicle(new Car("Mecidex1", "C-class", 2003, 7));
        manager.addVehicle(new Car("Mecidex2", "D-class", 2033, 8));
        
        Vehical latestV = manager.findLatestVehicle();
        latestV.displayInfor();
    }
}
