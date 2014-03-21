


public class Main
{

   
    public static void main(String args[])
        throws InterruptedException
    {
        (new Centro_reg(broadcast, "Liguria ")).start();
        (new Centro_reg(broadcast, "Basilicata ")).start();
        (new Centro_reg(broadcast, "Toscana ")).start();
        Thread.sleep(100);
        (new Allerta(broadcast, "")).start();
    }

    static Broadcast broadcast = new Broadcast();

}