package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int fatorial = sc.nextInt();

        int multiplicar = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicar = multiplicar * i;
        }

        System.out.println("Fatorial de " + fatorial + " = " + multiplicar);
   } 
}
