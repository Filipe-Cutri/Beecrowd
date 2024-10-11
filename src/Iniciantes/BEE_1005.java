package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1005 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a1 = leitor.nextDouble();
        double a2 = leitor.nextDouble();

        double media = ((a1 * 3.5 + a2 * 7.5) / 11);
        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
