package People.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DriversList
{
    Set drivers= new HashSet<Driver>();

    public DriversList ()
    {
    }

    public Set getDrivers() {
        return drivers;
    }

    // добавление водителя в список
    public void addDriver(Driver driver)
    {
        if (drivers.contains(driver))
        {
            System.out.println("Такой водитель уже добавлен");
        }
        this.drivers.add(driver);
    }
    public void printNameDrivers()
    {
            System.out.println(Arrays.toString(drivers.toArray()));
    }
}
