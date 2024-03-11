package Kapitel11;

import java.util.Scanner;

public class tst {
    public static int removeduplicates(int tal[], int n){
        int[] temp = new int[tal.length];
        int j = 0;

        for (int i = 0; i < tal.length - 1; i++){
            if (tal[i] !=tal[i + 1]){
                temp[j++] = tal[1];
            }
        }
        temp[j++] = tal[tal.length -1 ];

        for (int i = 0; i < j; i++){
            tal[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int[] tal = new int[5];

        System.out.println("Skriv in dina tal.");

        int num = in.nextInt();

        int n = tal.length;

        while (num >0) {
            for (int i = 0; i < 5; i++) {
                tal[i] = num;
                num = in.nextInt();
            }
        }
        n = removeduplicates(tal, n);
        System.out.println(tal[n]);
        for (int i = 0; i < tal.length; i++) {
            System.out.println(tal[n] + " ");
        }

    }
}


