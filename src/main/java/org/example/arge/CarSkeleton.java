package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + "starting engine.";
    }

    public String drive(){
        runEngine(this);
        return getName() + "is driving.";
    }

    public void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
           double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
           int BatterySize = ((ElectricCar) carSkeleton).getBatterySize();
        } else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
        } else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
        }
        else{
            System.out.println("Invalid car type!");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
