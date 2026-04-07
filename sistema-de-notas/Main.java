import java.util.Scanner;

public class Main {
    private static final double MEDIA_APROVACAO = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] alunos = new String[3]; // Vetor para armazenar os alunos
        double[][] notas = new double[3][4]; // Matriz para armazenar alunos e notas
        double[] medias = new double[3]; // Vetor para armazenar as medias finais de cada linha da matriz

        for (int i = 0; i < 3; i++) { // Estrutura Nested Loop com For para percorrer as notas por aluno
            System.out.println("Insira o nome do " + (i + 1) + "º aluno.");
            alunos[i] = input.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.println("Insira a " + (j + 1) + "º nota de " + alunos[i]);
                notas[i][j] = input.nextDouble();
            }

            input.nextLine(); // Limpar Buffer do Scanner
        }

        input.close();
    }
}