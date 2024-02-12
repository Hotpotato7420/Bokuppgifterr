package Kapitel9;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;


public class Uppgift9_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hur mycket vill du ta ut varje år?(kr) ");
        String s = input.next();
        double ut = Double.parseDouble(s);

        System.out.print("Hur mycket är räntan?(%) ");
        String rentS = input.next(); // Skapar en String
        rentS = rentS.replace("%", ""); //Tar bort % ifrån stringen ifall man svarat med det
        int rent = Integer.parseInt(rentS); // Gör om stringen till en int


        System.out.print("Hur mycket har du på kontot?(kr) ");
        double belopp = input.nextDouble();

        if (ut > belopp*0.01*rent){ // Stänger programmet tidigt ifall uttaget är mer än räntan.
            System.out.println("För stort uttag.");
            System.exit(0);
        }

        System.out.print("Hur många år vill du se? ");
        int years = input.nextInt();



        beloppVidUttag(belopp, rent, years, ut);
    }




    public static void beloppVidUttag(double b, double r, int n, double ut){

        for (int i=1; i <= n; i++){//Ett varv per år
            b = b +b*(0.01*r)-ut;

            System.out.println("--------------- \n | \n |");

            System.out.println("År: " + i + " | " + b + "kr");
        }
    }
}

