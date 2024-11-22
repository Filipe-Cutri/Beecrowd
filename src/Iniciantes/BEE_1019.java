package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1019 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int horasN = n / 3600;
        int minutosN = (n % 3600) / 60;
        int segundosN = n % 60;

        System.out.println(horasN + ":" + minutosN + ":" + segundosN);
    }
}
