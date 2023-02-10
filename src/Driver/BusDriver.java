package Driver;

public class BusDriver extends Driver
{
    public BusDriver(String name, String driveLicense, int experience)
    {
        super(name, driveLicense, experience);
        if (driveLicense.equals("D"))
        {
            System.out.println("Водитель добавлен");
        }
        else
        {
            throw new IllegalArgumentException("Тип прав для водителя автобусов должен быть D");
        }
    }
}
