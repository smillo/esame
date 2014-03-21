

class Centro_reg extends Thread
{

    Centro_reg(Broadcast b, String regione)
    {
        broadcast = b;
        name = regione;
    }

    public void run()
    {
        System.out.println((new StringBuilder(String.valueOf(name))).append("attendo informazioni su onde..").toString());
        try
        {
            String msg = (String)broadcast.receive();
            System.out.println((new StringBuilder(String.valueOf(name))).append("ricevuto aggiornamento tsunami..").append(msg).toString());
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    String name;
    Broadcast broadcast;
}