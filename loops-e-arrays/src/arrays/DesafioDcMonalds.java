package arrays;

import java.util.Scanner;

public class DesafioDcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String[] listaIngredientes = ingredientes.split("\\;", -1);        
 
        for (int i = 0; i < listaIngredientes.length; i++) {
            System.out.println(listaIngredientes[i]);
        }
    }
}
