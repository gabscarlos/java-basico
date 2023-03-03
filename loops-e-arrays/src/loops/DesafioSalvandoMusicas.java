package loops;

import java.util.Scanner;

public class DesafioSalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        String mp3 = ".mp3";

        if (arquivoDoPc.endsWith(mp3)) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }        
        
    }
}
