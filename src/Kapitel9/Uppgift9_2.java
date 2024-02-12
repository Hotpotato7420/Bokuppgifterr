package Kapitel9;

import java.util.Locale;
import java.util.Scanner;

public class Uppgift9_2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("SE"));

        Scanner in = new Scanner(System.in);

        System.out.print("Dagens mätarställning?: ");
        int mätarStällning = in.nextInt(); // Läser in dagens mätarställning

        System.out.print("Mätarställning ett år sedan?: ");
        int mätarEttÅr = in.nextInt(); // Läser in mätarställningen ett år sen

        System.out.print("Antal liter förbrukad bensin?: ");
        double förbrukadBensin = in.nextDouble(); // Läser in antalet förbrukad bensin

        double kördaMil = mätarStällning - mätarEttÅr;
        System.out.format(new Locale("sv", "SE"),"Antal körda mil: %.2f \n",  (kördaMil)); // Beräknar antalet körda mil

        System.out.format(new Locale("sv", "SE"),
                "Antal liter bensin: %.2f \n", förbrukadBensin);

        // Gör förbukningen till en variabel och sedan använder den
        double förbrukning = förbrukadBensin/kördaMil;
        System.out.format(new Locale("sv", "SE"),
                "Förbrukning per mil: %.2f \n",förbrukning);

    }
}