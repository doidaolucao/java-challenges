import java.util.Scanner;

public class Main {
    private static final double MEDIA_APROVACAO = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        int totalAlunos = 0;
        String decisaoUsuario = "";

        String[] alunos = new String[3]; // Vetor para armazenar os alunos
        double[][] notas = new double[3][4]; // Matriz para armazenar alunos e notas
        double[] medias = new double[3]; // Vetor para armazenar as medias finais de cada linha da matriz

        while (true) {
            System.out.println("\n*** BOAS VINDAS AO SISTEMA DE NOTAS ****");
            System.out.println("ESTE SISTEMA FOI CRIADO PARA GESTÃO DE BOLETIM DE NOTAS DOS ALUNOS");
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO PARA PROSSEGUIR COM ATENDIMENTO.");
            System.out.println("\n1 - Cadastrar aluno\n2 - Remover aluno\n3 - Boletim\n4 - Sair\n");

            opcao = input.nextInt(); // Armazena a opção selecionada
            input.nextLine(); // Limpar Buffer do Scanner

            if (opcao == 1) {
                do {
                    if (totalAlunos < 3) { // Se a quantidade máxima for menor que 3, criar um novo cadastro de aluno
                        double soma = 0;
                        String nomeAluno = "";

                        do { // Loop para definir nome do aluno
                            System.out.println("\nInsira o nome do " + (totalAlunos + 1) + "° aluno");
                            nomeAluno = input.nextLine();

                            if (nomeAluno.trim().isEmpty()) { // Validação se a variável foi preenchida
                                System.out.println("Erro: O nome não pode ficar em branco. Insira um nome válido!");
                            }
                        } while (nomeAluno.trim().isEmpty());

                        alunos[totalAlunos] = nomeAluno; // Ao ser preenchido, o nome é armazenado no vetor
                        
                        for (int j = 0; j < 3; j++) { // FOR para armazenar as notas e somar                
                            System.out.println("Insira a " + (j + 1) + "º nota de " + alunos[totalAlunos]);

                            notas[totalAlunos][j] = input.nextDouble();
                            soma += notas[totalAlunos][j];
                            medias[totalAlunos] = soma / 3;
                        }

                        input.nextLine(); // Limpar buffer
                        totalAlunos++;

                        if (totalAlunos < 3) { // Verificação de se o usuário deseja cadastrar mais um aluno
                            System.out.println("\nDeseja cadastrar mais um aluno? (S/N)");
                            decisaoUsuario = input.nextLine();

                        } else if (totalAlunos >= 3) {
                            System.out.println("\nQuantidade de aluno excedida!");
                            decisaoUsuario = "N";

                        }

                    } else {
                        System.out.print("Quantidade de aluno excedida!\n");

                    }

                } while (decisaoUsuario.equalsIgnoreCase("S") && totalAlunos < 3);

            } else if (opcao == 2) {
                // EM CONSTRUÇÃO...

            } else if (opcao == 3) {
                System.out.println("------- BOLETIM ESTUDANTIL -------");

                for (int i = 0; i < totalAlunos; i++) {
                    if (medias[i] >= MEDIA_APROVACAO) {
                        System.out.printf("\nAluno: %s | Média: %.1f | Status: APROVADO\n", alunos[i], medias[i]);
                    } else {
                        System.out.printf("\nAluno: %s | Média: %.1f | Status: REPROVADO\n", alunos[i], medias[i]);
                    }

                }

            } else if (opcao == 4) {
                System.out.println("\nEncerrando o sistema...");
                break;

            } else {
                System.out.print("\nInsira uma opção válida!");

            }
        }
        input.close();
    }
}