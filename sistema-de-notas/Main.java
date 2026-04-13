import java.util.Scanner;

public class Main {
    private static final double MEDIA_APROVACAO = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        String[] alunos = new String[3]; // Vetor para armazenar os alunos
        double[][] notas = new double[3][4]; // Matriz para armazenar alunos e notas
        double[] medias = new double[3]; // Vetor para armazenar as medias finais de cada linha da matriz

        while (true) {
            System.out.println("******* BOAS VINDAS AO SISTEMA DE NOTAS ********");
            System.out.println("ESTE SISTEMA FOI CRIADO PARA GESTÃO DE BOLETIM DE NOTAS DOS ALUNOS");
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO PARA PROSSEGUIR COM ATENDIMENTO.");
            System.out.println("\n1 - Cadastrar aluno\n2 - Remover aluno\n3 - Sair\n");
            
            opcao = input.nextInt();
            input.nextLine();


            if (opcao == 1) {
                for (int i = 0; i < 3; i++) { // Estrutura Nested Loop com For para percorrer as notas por aluno
                    System.out.println("Insira o nome do " + (i + 1) + "º aluno.");
                    alunos[i] = input.nextLine();

                    for (int j = 0; j < 3; j++) {
                        System.out.println("Insira a " + (j + 1) + "º nota de " + alunos[i]);
                        notas[i][j] = input.nextDouble();
                    }
                }

            } else if (opcao == 2) {
                // EM CONSTRUÇÃO...
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Insira uma opção válida!");
            }

            input.nextLine(); // Limpar Buffer do Scanner
        }

        input.close();
    }
}