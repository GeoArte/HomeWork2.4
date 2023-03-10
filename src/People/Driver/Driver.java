package People.Driver;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Driver
{
    private String name;
    private String driveLicense;
    private int experience;
    String defaulta = "Default";

    public Driver(String name, String driveLicense, int experience)
    {
        if (name.equals("") || name.equals(null))
        {
            this.name = defaulta;
        }
        else
        {
            this.name = name;
        }
        if (driveLicense.equals("B") || driveLicense.equals("C") || driveLicense.equals("D"))
        {
            this.driveLicense = driveLicense;
        }
        else
        {
            this.driveLicense = "no";
        }
        if (experience >= 0)
        {
            this.experience = experience;
        }
        else
        {
            this.experience = 0;
        }
    }
    public String getName()
    {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public String getDriveLicense() {
        return this.driveLicense;
    }
    public void startMovement()
    {
        System.out.println("Движение начато");
    }
    public void stopMovement()
    {
        System.out.println("Движение прекращено");
    }
    public void refuelTheCar()
    {
        System.out.println("Машина заправлена");
    }
    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Driver driver = (Driver) obj;
        return experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(driveLicense, driver.driveLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driveLicense, experience);
    }
}
