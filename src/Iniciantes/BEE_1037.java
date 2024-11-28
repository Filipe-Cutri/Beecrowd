package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1037 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        if (a >= 0 && a <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (a >= 25.00001 && a <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (a >= 50.0001 && a <= 75.0000) {
            System.out.println("Intervalo (50,75]");
        } else if (a >= 75.0001 && a <= 100.0000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
