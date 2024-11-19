package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1016 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int distanciaKm = scanner.nextInt();

        int distanciaFinal = distanciaKm * 2;

        System.out.println(distanciaFinal + " minutos");
    }
}
