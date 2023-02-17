package Driver;

public class PassengerCarDriver extends Driver
{

    public PassengerCarDriver(String name, String driveLicense, int experience)
    {
        super(name, driveLicense, experience);
        if (driveLicense.equals("B"))
        {
            System.out.println("Водитель добавлен");
        }
        else
        {
            throw new IllegalArgumentException("Тип прав для водителя легковых автомобилей должен быть B");
        }
    }
}