package People;

import Transport.*;

public class Mechanic {
    private String name;
    private String company;
    final String defaulta = "Петров Василий Иванович";
    final String defaultaCompany = "default";

    public Mechanic(String name, String company)
    {
        if (name == null || name.equals(""))
        {
            this.name = defaulta;
        }
        else
        {
            this.name = name;
        }
        if (company == null || company.equals(""))
        {
            this.company = defaultaCompany;
        }
        else
        {
            this.company = company;
        }
    }

    public String getCompany()
    {
        return company;
    }

    public String getName()
    {
        return name;
    }

    public void performMaintenance(Transport a) throws TransportTypeException
    {
        int b = 0;
        for (int i = 0; i < a.whoMechanics().size(); i++)
        {
            if (this.equals(a.whoMechanics().get(i)))
            {
                b++;
            }
        }
        if (b != 0)
        {
            a.passDiagnostics();
            System.out.println(this.name + " провёл техобслуживание " + a.getBrand() + a.getModel());
        }
        else
        {
            System.out.println("Этот механник не может обслужить эту машину");
        }
    }
    public void fixTheCar(Transport a)
    {
        int b = 0;
        for (int i = 0; i < a.whoMechanics().size(); i++)
        {
            if (this.equals(a.whoMechanics().get(i)))
            {
                b++;
            }
        }
        if (b != 0)
        {
            System.out.println(this.name + " починил " + a.getBrand() + a.getModel());
        }
        else
        {
            System.out.println("Этот механник не может обслужить эту машину");
        }
    }
}
