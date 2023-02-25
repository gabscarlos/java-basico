package loops;

import java.util.Scanner;

/* 
Faça um programa que peça uma nota entra zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        while (true) {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) break;
            System.out.println("Nota inválida");
        }


    }
}
