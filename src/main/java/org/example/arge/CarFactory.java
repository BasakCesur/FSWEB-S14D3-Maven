package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "tesla decs", 700, 2000);
        CarSkeleton hybridCar = new HybridCar("Toyota", "tyt decs", 700, 4000, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Honda", "honda decs", 500, 4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);

    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }

}
