package loops;
import java.util.Scanner;

public class DesafioPontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        String mensagem = "";

        if(velocidade > 80) {
            multas = multas + 1;
        }
        if(multas == 3) {
            mensagem = " Levou pontos na carteira";
        } else {
            mensagem = " Nao levou pontos na carteira";}

        System.out.println(multas + " multas." + mensagem);
        
    }
}