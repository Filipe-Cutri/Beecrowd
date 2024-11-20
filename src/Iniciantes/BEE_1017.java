package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1017 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double tempo = scanner.nextDouble();
        double velocidadeMedia = scanner.nextDouble();

        double litrosCombustivel = (tempo * velocidadeMedia) / 12;

        System.out.println(String.format("%.3f", litrosCombustivel));
    }
}
