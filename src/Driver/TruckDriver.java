package Driver;

public class TruckDriver extends Driver
{
    public TruckDriver(String name, String driveLicense, int experience)
    {
        super(name, driveLicense, experience);
        if (driveLicense.equals("C"))
        {
            System.out.println("Водитель добавлен");
        }
        else
        {
            throw new IllegalArgumentException("Тип прав для водителя грузовых машин должен быть C");
        }
    }
}
