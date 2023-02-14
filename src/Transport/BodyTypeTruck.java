package Transport;

public enum BodyTypeTruck
{
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 до 12 тонн"),
    N3("с полной массой свыше 12 тонн");

    private String bodyType;

    BodyTypeTruck(String bodyType)
    {
        this.bodyType = bodyType;
    }
    @Override
    public String toString()
    {
        return this.bodyType;
    }
}
