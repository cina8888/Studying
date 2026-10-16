package Oop.Inheritance.practice1;
import java.util.List;
import java.util.ArrayList;

public class VehicalManager {
    private List<Vehical> vehicals;

    public VehicalManager() {
        this.vehicals = new ArrayList<>();
    }

    public void addVehicle(Vehical v) {
        this.vehicals.add(v);
    }

    public Vehical findLatestVehicle() {
        if (vehicals.isEmpty()) {
            return null;
        };

        Vehical latest = vehicals.get(0);

        for (Vehical v: vehicals) {
            if(v.getYear() < latest.getYear()) {
                latest = v;
            }
        }

        return latest;
    }
}
