import Driver.*;
import Transport.*;

public class Main {
    public static void main(String[] args)
    {
        TruckDriver semen = new TruckDriver("Станов Семён Семёнович", "C", 3);
        BusDriver ivan = new BusDriver("Иванов Иван Михайлович", "D", 2);
        PassengerCarDriver sveta = new PassengerCarDriver("Дубова Света Владимировна", "B", 6);
        Truck tA = new Truck("String brand", "String model", 2000, "String country", "String color", 200, 2.4, "String transmission", BodyTypeTruck.N1,1, 5, true, semen);
        Truck tB = new Truck("", "", 1500, "", "Black", 1, -1.0, "", BodyTypeTruck.N2, 2, 3, false, semen);
        Truck tC = new Truck("Ford", "", 1999, "America", "Blue", 1000, 10.0, "Автомат", BodyTypeTruck.N3, 3, 4, false, semen);
        Truck tD = new Truck("Nissan", "Truck", 2020, "Japan", "White", 120, 6.0, "Автомат", BodyTypeTruck.N3, 4, 2, true, semen);
        Bus bA = new Bus("", "", 2021, "", "", -1000, 4.0, ivan, BodyTypeBus.Small);
        Bus bB = new Bus("Vas", "Electrobus", 2022, "Russia", "Blue", 60, 0.0, ivan, BodyTypeBus.Big);
        Bus bC = new Bus("", "", 1998, "United Kingdom", "Red", 70, 6.0, ivan, BodyTypeBus.VeryBig);
        Bus bD = new Bus("", "School", 2001, "USA", "Yellow", 90, 8.0, ivan, BodyTypeBus.Middle);
        PassengerCar pA = new PassengerCar("Mazda", "", 2015, "", "Green", 120, 5.0, "", BodyTypePassengerCar.SUV, 1, 5, true, sveta);
        PassengerCar pB = new PassengerCar("Tesla", "CyberTrack", 2021, "USA", "Gray", 200, 0.0, "", BodyTypePassengerCar.Sedan, 2, 5, false, sveta);
        PassengerCar pC = new PassengerCar("", "", 1500, "", "Black", 1, -1.0, "", BodyTypePassengerCar.Crossover, 3, 3, false, sveta);
        PassengerCar pD = new PassengerCar("Ferrari", "", 2000, "Italia", "Red", 200, 5.0, "", BodyTypePassengerCar.Van, 4, 1, false, sveta);
        System.out.println("Водитель " + pA.getDriver().toString() + " управляет автомобилем " + pA.toString() + " и будет участвовать в заезде");
        tA.passDiagnostics();
        pA.passDiagnostics();
        bA.passDiagnostics();
    }
}