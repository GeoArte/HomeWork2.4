package Transport;

import Driver.Driver;

public abstract class Transport
{
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private static String color;
    private static int maxSpeed;
    private static double engineVolume;
    private static boolean movement;
    private static Driver driver;
    String defaulta = "Default";
    private final Type type;

    public Transport(String brand, String model, int year, String country, String color, int speed, double engineVolume, Driver driver, Type type)
    {
        if (brand.equals("") || brand.equals(null))
        {
            this.brand = defaulta;
        }
        else
        {
            this.brand = brand;
        }
        if (model.equals("") || model.equals(null))
        {
            this.model = defaulta;
        }
        else
        {
            this.model = model;
        }
        if (year >= 1900 && year <= 2023)
        {
            this.year = year;
        }
        else
        {
            this.year = 2000;
        }
        if (country.equals("") || country.equals(null))
        {
            this.country = defaulta;
        }
        else
        {
            this.country = country;
        }
        if (color.equals("") || color.equals(null))
        {
            this.color = defaulta;
        }
        else
        {
            this.color = color;
        }
        if (speed < 60 || speed > 300)
        {
            this.maxSpeed = 60;
        }
        else
        {
            this.maxSpeed = speed;
        }
        if (engineVolume > 0)
        {
            this.engineVolume = engineVolume;
        }
        else
        {
            this.engineVolume = 1.5;
        }
        this.movement = false;
        this.driver = driver;
        this.type = type;
    }

    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    public int getYear()
    {
        return year;
    }

    public  String getBrand()
    {
        return brand;
    }

    public String getColor()
    {
        return color;
    }

    public  String getCountry()
    {
        return country;
    }

    public  String getModel()
    {
        return model;
    }

    public boolean getMovement()
    {
        return this.movement;
    }
    public void setColor(String color)
    {
        if (color.equals("") || color.equals(null))
        {
            this.color = defaulta;
        }
        else
        {
            this.color = color;
        }
    }
    public Type getType(){return type;}

    public void setMaxSpeed(int speed)
    {
        if (speed < 60)
        {
            this.maxSpeed = 60;
        }
        else
        {
            this.maxSpeed = speed;
        }
    }
    public double getEngineVolume()
    {
        return this.engineVolume;
    }
    public void startMovement()
    {
        this.movement = true;
    }
    public void stopMovement()
    {
        this.movement = false;
    }

    public static Driver getDriver()
    {
        return driver;
    }

    public String toString()
    {
        return this.brand + " " + this.model;
    }

    abstract String printType();
}
