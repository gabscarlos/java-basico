import java.io.*;

import javax.swing.JOptionPane;

//Imprimir um arquivo no console.

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "README.md";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que voê deseja imprimir! " + e.getCause());
            //e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!" + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}