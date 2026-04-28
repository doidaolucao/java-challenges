import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int topo = -1;
    static String[] pilha = new String[5];

    public static void main(String[] args) {
        int opcao = 0;

        while (true) {
            System.out.println("\n------------------------------\nBEM-VINDO AO SISTEMA DE PILHA\nInsira o que deseja fazer\n\n1 - Empilhar\n2 - Remover\n3 - Listar pilha\n0 - Sair\n");
            opcao = input.nextInt();

            input.nextLine();

            if (opcao == 1) {
                Empilhar();

            } else if (opcao == 2) {
                Remover();

            } else if (opcao == 3) {
                Listar();

            } else if (opcao == 0) {
                break;

            } else {
                System.out.println("\nInsira opção válida!");
            }
            
        }
    }   

    public static void Empilhar() {
        if (topo < pilha.length - 1) {
            System.out.println("\nInsira um nome:");
            String nome = input.nextLine();

            topo++;
            pilha[topo] = nome;

            System.out.println("\nEmpilhado com sucesso!");

        } else {
            System.out.println("\nA pilha está cheia!");

        }
    }

    public static void Remover() {
        if (topo == -1) {
            System.out.println("\nNão há o que remover!");

        } else {
            System.out.println("\nRemovendo o último...");
        
            pilha[topo] = null;
            topo--;

            System.out.println("\nRemovido com sucesso!");
        }
    }

    public static void Listar() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");

        } else {
            System.out.print("Pilha: ");

            for(int i = 0; i <= topo; i++) {
                if (topo == 0) {
                    System.out.print(pilha[i]);

                } else {
                    System.out.print(pilha[i] + " | ");
                    
                }
            };

        }
    }
}