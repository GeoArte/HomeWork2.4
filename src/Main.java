import Driver.BusDriver;
import Driver.PassengerCarDriver;
import Driver.TruckDriver;
import Transport.Transport;
import Transport.Truck;
import Transport.Bus;
import Transport.PassengerCar;

public class Main {
    public static void main(String[] args)
    {
        TruckDriver semen = new TruckDriver("Станов Семён Семёнович", "C", 3);
        BusDriver ivan = new BusDriver("Иванов Иван Михайлович", "D", 2);
        PassengerCarDriver sveta = new PassengerCarDriver("Дубова Света Владимировна", "B", 6);
        Truck tA = new Truck("String brand", "String model", 2000, "String country", "String color", 200, 2.4, "String transmission", "String bodyType",1, 5, true, semen);
        Truck tB = new Truck("", "", 1500, "", "Black", 1, -1.0, "", "", 2, 3, false, semen);
        Truck tC = new Truck("Ford", "", 1999, "America", "Blue", 1000, 10.0, "Автомат", "Монстер кар", 3, 4, false, semen);
        Truck tD = new Truck("Nissan", "Truck", 2020, "Japan", "White", 120, 6.0, "Автомат", "Monster car", 4, 2, true, semen);
        Bus bA = new Bus("", "", 2021, "", "", -1000, 4.0, ivan);
        Bus bB = new Bus("Vas", "Electrobus", 2022, "Russia", "Blue", 60, 0.0, ivan);
        Bus bC = new Bus("", "", 1998, "United Kingdom", "Red", 70, 6.0, ivan);
        Bus bD = new Bus("", "School", 2001, "USA", "Yellow", 90, 8.0, ivan);
        PassengerCar pA = new PassengerCar("Mazda", "", 2015, "", "Green", 120, 5.0, "", "Passenger", 1, 5, true, sveta);
        PassengerCar pB = new PassengerCar("Tesla", "CyberTrack", 2021, "USA", "Gray", 200, 0.0, "", "", 2, 5, false, sveta);
        PassengerCar pC = new PassengerCar("", "", 1500, "", "Black", 1, -1.0, "", "", 3, 3, false, sveta);
        PassengerCar pD = new PassengerCar("Ferrari", "", 2000, "Italia", "Red", 200, 5.0, "", "", 4, 1, false, sveta);
        System.out.println("Водитель " + tC.getDriver().toString() + " управляет автомобилем " + tC.toString() + " и будет участвовать в заезде");
    }
}