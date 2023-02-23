import Transport.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation
{
    Queue<Transport> ServiceStationQueue = new LinkedList<>();

    public ServiceStation()
    {
    }
    public void addTransportInServiceStationQueue(Transport a)
    {
        ServiceStationQueue.offer(a);
    }
    public void inspectionCar()
    {
        try
        {
            ServiceStationQueue.poll().passDiagnostics();
        }
        catch (TransportTypeException e)
        {
            throw new RuntimeException(e);
        }
    }
}
