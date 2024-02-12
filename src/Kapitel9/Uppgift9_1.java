
package Kapitel9;

import java.util.Scanner;

public class Uppgift9_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dagens mätarställning?: ");
        int mätarStällning = in.nextInt(); // Läser in dagens mätarställning

        System.out.print("Mätarställning ett år sedan?: ");
        int mätarEttÅr = in.nextInt(); // Läser in mätarställningen ett år sen

        System.out.print("Antal liter förbrukad bensin?: ");
        int förbrukadBensin = in.nextInt(); // Läser in antalet förbrukad bensin

        double kördaMil = mätarStällning - mätarEttÅr;
        System.out.println("Antal körda mil?: " + (kördaMil)); // Beräknar antalet körda mil

        System.out.println("Antal liter bensin: " + förbrukadBensin);

        System.out.println("Förbrukning per mil: " + (förbrukadBensin/kördaMil));

    }
}