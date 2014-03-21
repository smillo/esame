

class Allerta extends Thread
{

    Allerta(Broadcast b, String msg)
    {
        broadcast = b;
        this.msg = Onda.invia();
    }

    public void run()
    {
        System.out.println("novit\340 dal centro di controllo...Evento sismico!!");
        broadcast.send(msg);
    }

    Broadcast broadcast;
    private String msg;
}