public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Executando a classe Calculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(10, 20);
        Calculadora.multiplicacao(10, 20);
        Calculadora.divisao(10, 20);

        System.out.println("Executando a classe Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(25);

        System.out.println("Executando a classe Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);

    }
}
