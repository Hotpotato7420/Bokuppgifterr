package Kapitel11;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Uppgift11_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[1];
        int arrayLength = a.length;
        int[] temp = new int[arrayLength++];

        System.out.print("Skriv in dina nummer: ");
        for (int i = 0; i<arrayLength; i++){
            a[i] = in.nextInt();
            arrayLength++;

        }

        HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
        for (int i = 0; i < arrayLength; i++){
            if (seen.containsKey(a[i])) {
                continue;
            }

            seen.put(a[i], true);
            System.out.println(a[i]);
        }
    }
}
