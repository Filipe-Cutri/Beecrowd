package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1014 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double autonomia = x / y;

        System.out.printf(String.format("%.3f km/l\n", autonomia));

        scanner.close();
    }
}
