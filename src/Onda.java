

public class Onda
{

    Onda(double lat, double longit, String data, double ora, 
            String tipo, String arrivo, String posizione, String livello)
    {
        lat = lat;
        longit = longit;
        data = data;
        ora = ora;
        tipo = tipo;
        this.livello = livello;
        arrivo = (new StringBuilder(String.valueOf(data))).append(" ").append(ora).toString();
        posizione = (new StringBuilder("arriva con latitudine ")).append(lat).append(" e longitudine ").append(longit).toString();
    }

    public static String invia()
    {
        return (new StringBuilder("...Verificato evento sismico! \nlatitudine ")).append(String.format("%1$,.2f", new Object[] {
            Double.valueOf(lat)
        })).append("\nlongitudine ").append(String.format("%1$,.2f", new Object[] {
            Double.valueOf(longit)
        })).append("\nin data ").append(data).append("\nalle ").append(ora).append("\nonda di tipo ").append(tipo).append("\nlo tsunami si abbatter\340 nella localit\340 con le seguenti coordinate:  ").append(String.format("%1$,.2f", new Object[] {
            Double.valueOf(lat2)
        })).append(", ").append(String.format("%1$,.2f", new Object[] {
            Double.valueOf(long2)
        })).append("\nin data e ora: ").append(data).append(" ").append(ora2).append("\ncon livello di rischio: ").append(rischio).toString();
    }

    static double lat = (Math.random() * 100D) % 180D;
    static double longit = (Math.random() * 100D) % 180D;
    static String data = "18-05";
    static double ora = 21.129999999999999D;
    static double ora2 = 23.43D;
    static String tipo = "positiva";
    static double lat2 = (Math.random() * 100D) % 180D;
    static double long2 = (Math.random() * 100D) % 180D;
    String livello;
    static String rischio = "Medio";

}