package Iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class BEE_1008 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int idFuncionario = leitor.nextInt();
        int horasTrabalhadas = leitor.nextInt();
        double valorHora = leitor.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
