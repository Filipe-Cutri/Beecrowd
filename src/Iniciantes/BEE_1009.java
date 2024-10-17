package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1009 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String nomeVendedor = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double totalVendas = leitor.nextDouble();

        double salarioTotal = ((totalVendas * 15) / 100) + salarioFixo;

        System.out.println(String.format("TOTAL = R$ %.2f", salarioTotal));
    }
}
