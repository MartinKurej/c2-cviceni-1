package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
<<<<<<< HEAD
        int s = 0;
        int l = 1;
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if (n%2 == 0){
                s = s + n;
            }else {
               l = l * n;
            }
        }
        return s + l;
=======
        int i = 0;
        int y = 1;
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            if (x%2 == 0){
                i = i + x;
            }else {
               y = y * x;
            }
        }
        return i + y;
>>>>>>> efccb141045e500f706cb7944c43f7526991dbdb
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
