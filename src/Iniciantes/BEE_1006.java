package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1006 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a1 = leitor.nextDouble();
        double a2 = leitor.nextDouble();
        double a3 = leitor.nextDouble();

        double media = ((a1 * 2 + a2 * 3 + a3 * 5) / 10);
        System.out.println(String.format("MEDIA = %.1f", media));
    }
}
