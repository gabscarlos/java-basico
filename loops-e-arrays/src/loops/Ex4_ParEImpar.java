package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Digite a quantidade de números que deseja digitar: ");
        quantNumeros = sc.nextInt();

        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
            
            count = count + 1;
        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares é: " + quantPares);
        System.out.println("A quantidade de números ímpares é: " + quantImpares);
    }
}
