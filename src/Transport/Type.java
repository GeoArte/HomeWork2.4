package Transport;

public enum Type
{
    PASSENGERCAR("Легковой автомобиль"),
    TRUCK("Грузовой автомобиль"),
    BUS("Автобус");

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