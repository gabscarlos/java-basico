package loops;

import java.util.Scanner;

public class DesafioCamarote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tamanhoDaFila = sc.nextInt();

        int pessoasNoCamarote = 0;

        if(tamanhoDaFila % 2 == 0) {
            pessoasNoCamarote = tamanhoDaFila / 2;
        } else {
            pessoasNoCamarote = (tamanhoDaFila / 2) + 1;
        }

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}
