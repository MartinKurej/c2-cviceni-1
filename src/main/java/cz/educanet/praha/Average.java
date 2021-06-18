package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner sc) {
        int prumer = 0;
        int pocet = 0;
        while (sc.hasNext()) {
            prumer += sc.nextInt();
            pocet++;
        }
        return (double) prumer/pocet;
    }

    public static void main(String[] args) {
        System.out.println(prumer(new Scanner(System.in)));
    }
}
