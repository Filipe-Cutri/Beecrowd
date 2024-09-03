package Iniciantes;

import java.util.Scanner;

public class BEE_1001 {
    public static void main(String[] args) {
        int X;

        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int A = read.nextInt();

        System.out.print("Digite um número inteiro: ");
        int B = read.nextInt();

        X = A + B;
        System.out.println("X = " + X);
    }
}

