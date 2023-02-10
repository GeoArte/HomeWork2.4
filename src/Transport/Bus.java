package Transport;

import Driver.BusDriver;

public class Bus<T extends BusDriver> extends Transport implements Competing
{
    public Bus(String brand, String model, int year, String country, String color, int speed, double engineVolume, T driver)
    {
        super(brand, model, year, country, color, speed, engineVolume, driver);
    }
    @Override
    public void bestTimeCircle()
    {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed()
    {
        System.out.println("Иаксимальная скорость");
    }

    @Override
    public void pitStop()
    {
        System.out.println("Остановка на пит стоп");
    }
}
