import java.util.Scanner;

// Boas vindas ao meu início de aprendizado em Java!

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        calculadora(args);
    }

    // Agora que já tiramos a maldição, vamos ao primeiro exercício!! :)
    // Calculadora IMC, utilizado para avaliar o peso ideal com base entre peso e altura.

    static void calculadora(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu peso:");
        double peso = input.nextDouble();

        System.out.println("Agora, insira a sua altura:");
        double altura = input.nextDouble();

        System.out.println("Calculando o seu IMC...");
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18) {
            System.out.printf("Seu peso está abaixo do normal.");
        } else if (imc > 18 && imc < 25) {
            System.out.printf("Seu peso está normal.");
        } else {
            System.out.printf("Você está com excesso de peso.");
        }

        System.out.print("");
        input.close();
    }
}