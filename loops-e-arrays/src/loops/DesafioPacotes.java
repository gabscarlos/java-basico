package loops;

import java.util.Scanner;

public class DesafioPacotes {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            System.out.print("/");
        }        
   } 
}
