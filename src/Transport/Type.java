package Transport;

public enum Type
{
    PassengerCar("Легковой автомобиль"),
    Truck("Грузовой автомобиль"),
    Bus("Автобус");

    private final String type;

    Type(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return this.type;
    }
}
