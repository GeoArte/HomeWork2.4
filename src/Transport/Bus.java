package Transport;

import Driver.BusDriver;

public class Bus<T extends BusDriver> extends Transport implements Competing
{
    private final BodyTypeBus bodyType;

    public Bus(String brand, String model, int year, String country, String color, int speed, double engineVolume, T driver, BodyTypeBus bodyType)
    {
        super(brand, model, year, country, color, speed, engineVolume, driver, Type.BUS);
        this.bodyType = bodyType;
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
    @Override
    public Type getType(){return this.getType();}

    @Override
    public String printType()
    {
        if (this.getType().equals(null))
        {
            return "Данных по транспортному средству недостаточно";
        }
        else
        {
            return this.getType().toString();
        }
    }
}