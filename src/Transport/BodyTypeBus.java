package Transport;

public enum BodyTypeBus
{
    VerySmall("до 10 мест"),
    Small("до 25 мест"),
    Middle("25–50 мест"),
    Big("50–80 мест"),
    VeryBig("80–120 мест");

    private String bodyType;

    BodyTypeBus(String bodyType)
    {
        this.bodyType = bodyType;
    }

    @Override
    public String toString()
    {
        return this.bodyType;
    }
}
