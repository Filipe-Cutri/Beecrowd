package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1011 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double raio = leitor.nextDouble();
        double volumeEsfera = (4 / 3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.println(String.format("VOLUME = %.3f", volumeEsfera));
    }
}
