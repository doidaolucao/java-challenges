import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in); // Scanner para inputs
    static int topo = -1; // -1 para indicar pilha vazia
    static String[] pilha = new String[5]; // Vetor para pilha

    public static void main(String[] args) {
        int opcao = 0; // Opção do usuário

        while (true) {
            System.out.println("\n------------------------------\nBEM-VINDO AO SISTEMA DE PILHA\nInsira o que deseja fazer\n\n1 - Empilhar\n2 - Remover\n3 - Listar pilha\n4 - Limpar pilha\n0 - Sair\n");
            opcao = input.nextInt();

            input.nextLine(); // Limpar buffer

            // *** ESTRUTURA DE DECISÃO MENU ***
            if (opcao == 1) {
                Empilhar();

            } else if (opcao == 2) {
                Remover();

            } else if (opcao == 3) {
                Listar();

            } else if (opcao == 4) {
                Limpar();

            } else if (opcao == 0) {
                break;

            } else {
                System.out.println("\nInsira opção válida!");
            }
            
        }
    }   

    public static void Empilhar() {
        if (topo < pilha.length - 1) { // LIMITE para a pilha de até 5, se passar, criar novo nome
            System.out.println("\nInsira um nome:");
            String nome = input.nextLine(); // Armazena variável

            topo++; // Adiciona a pilha
            pilha[topo] = nome; // O último da pilha recebe a variável

            System.out.println("\nEmpilhado com sucesso!");

        } else {
            System.out.println("\nA pilha está cheia!");

        }
    }

    public static void Remover() {
        if (topo == -1) { // Verifica se está vazia
            System.out.println("\nNão há o que remover!");

        } else {
            System.out.println("\nRemovendo o último...");
        
            pilha[topo] = null; // O último da pilha se torna null a variável
            topo--; // Remove posição

            System.out.println("\nRemovido com sucesso!");
        }
    }

    public static void Listar() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");

        } else {
            System.out.print("Pilha: ");

            for(int i = 0; i <= topo; i++) { // Listagem básica de pilha
                if (topo == 0) {
                    System.out.print(pilha[i]);

                } else {
                    System.out.print(pilha[i] + " | ");
                    
                }
            };

        }
    }

    public static void Limpar() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");

        } else {
            System.out.println("Pilha limpa!");

            topo = -1; // Limpa a pilha transformando a última posição em -1
        }
    }
}