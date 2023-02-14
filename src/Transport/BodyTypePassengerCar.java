package Transport;

public enum BodyTypePassengerCar
{
    Sedan("Седан"),
    Hatchback("Хетчбэк"),
    Coupe("Купе"),
    StationWagon("Универсал"),
    SUV("Внедорожник"),
    Crossover("Кроссовер"),
    PickupTruck("Пикап"),
    Van("Фургон"),
    Minivan("Минивэн");

    private String bodyType;
    BodyTypePassengerCar(String bodyType)
    {
        this.bodyType = bodyType;
    }

    @Override
    public String toString()
    {
        return this.bodyType;
    }
}
