package People.Driver;

import java.util.*;

public class DriverList
{
    HashSet drivers= new HashSet<Driver>();

    public DriverList ()
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
        System.out.println("Водители: ");
        Iterator<Driver> iterDriver = drivers.iterator();
        while (iterDriver.hasNext())
        {
            System.out.println(iterDriver.next().getName());
        }
    }
}