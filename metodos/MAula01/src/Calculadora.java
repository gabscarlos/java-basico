/* 
    * 1. Crie uma classe chamada Calculadora que contenha os seguintes métodos:
    * a. Somar
    * b. Subtrair
    * c. Multiplicar
    * d. Dividir    
 */

public class Calculadora {
    
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("O resultado da soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("O resultado da subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("O resultado da divisão de " + numero1 + " dividido " + numero2 + " é " + resultado);
    }
}
