

public class Broadcast
{

    public Broadcast()
    {
        arrived = false;
        waiting = 0;
    }

    public synchronized void send(Object message)
    {
        if(waiting != 0 && !arrived)
        {
            theMessage = message;
            arrived = true;
            notifyAll();
        }
    }

    public synchronized Object receive()
        throws InterruptedException
    {
        try
        {
            while(!arrived) 
            {
                waiting++;
                wait();
                waiting--;
            }
            if(waiting == 0)
                arrived = false;
        }
        catch(InterruptedException ie)
        {
            if(--waiting == 0)
                arrived = false;
        }
        return theMessage;
    }

    private Object theMessage;
    private boolean arrived;
    private int waiting;
}