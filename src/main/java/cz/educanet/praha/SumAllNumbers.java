package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int i = 0;

        while(scanner.hasNext()){
            int y = scanner.nextInt();
            i = i + y;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
