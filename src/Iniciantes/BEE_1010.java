package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1010 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int idPeca01 = leitor.nextInt();
        int qtdPeca01 = leitor.nextInt();
        double valorPeca01 = leitor.nextDouble();
        double valorTotalPeca01 = qtdPeca01 * valorPeca01;

        int idPeca02 = leitor.nextInt();
        int qtdPeca02 = leitor.nextInt();
        double valorPeca02 = leitor.nextDouble();
        double valorTotalPeca02 = qtdPeca02 * valorPeca02;

        double valorFinal = valorTotalPeca01 + valorTotalPeca02;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorFinal));
    }
}
