import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Classe que representa a entidade Empregado.
class Empregado {
    // Atributos do objeto
    int id;
    String name;
    int age;
    String role;
    
    // Construtor: Inicializa o objeto com os dados fornecidos
    public Empregado(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Sobrescrita do método toString para facilitar a exibição dos dados no console
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Cargo: " + role;
    }
}

public class Main {
    static List<Empregado> listaFuncionarios = new ArrayList<>(); // Arraylist para unicidade de novos cadastros
    static int Id = 0; // Controle incremental de IDs

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loop infinito para manter o sistema rodando até o usuário decidir sair (opção 0)
        while (true) {
            int opcao = 0;

            System.out.println("\n***** SISTEMA DE CADASTRO FUNCIONÁRIO *****\n");
            System.out.println("Insira o que deseja fazer:\n\n1 - Cadastrar funcionário\n2 - Listar\n3 - Remover\n0 - Sair\n");
            
            opcao = input.nextInt();

            // Limpeza do buffer
            input.nextLine();

            // Estrutura de controle de fluxo para as funcionalidades
            if (opcao == 1) {
                cadastrar(input);

            } else if (opcao == 2) {
                listar();

            } else if (opcao == 3) {
                remover(input);

            } else if (opcao == 0) {
                System.out.println("\nEncerrando...");
                break;

            } else {
                System.out.println("\nInsira uma opção válida!");
            }
        }
        
        input.close();
    }

    // Criação de novos funcionários
    public static void cadastrar(Scanner input) {
        System.out.println("\nInsira o seu nome:");
        String nome = input.nextLine();
        
        System.out.println("\nInsira a sua idade:");
        int idade = input.nextInt();

        input.nextLine(); // Limpa o buffer novamente

        System.out.println("\nInsira seu cargo no trabalho:");
        String cargo = input.nextLine();

        // Instancia o objeto e adiciona na lista usando o ID auto-incremental
        Empregado novoEmpregado = new Empregado(++Id, nome, idade, cargo);
        listaFuncionarios.add(novoEmpregado);

        System.out.println("\nFuncionário cadastrado!");
    }

    // Exibição de dados
    public static void listar() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("\nA lista de funcionário está vazia!");
        } else {
            System.out.println("\n**** FUNCIONÁRIOS CADASTRADROS ****");

            // Iteração (loop) sobre a lista para imprimir cada funcionário
            for (Empregado e : listaFuncionarios) {
                System.out.println(e);
            }
        }
    }

    // Remoção baseada em ID
    public static void remover(Scanner input) {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("\nNão há nada para remover!");

        } else {
            System.out.println("\nInsira o identificador do cadastro que deseja excluir:");
            int buscarId = input.nextInt();

            // For que percorre a lista procurando o ID correspondente
            for (int i = 0; i <= listaFuncionarios.size(); i++) {
                if (listaFuncionarios.get(i).id == buscarId) {
                    listaFuncionarios.remove(i);
                    System.out.println("Funcionário removido!");
                    
                    break; // Para o loop assim que encontrar e remover
                }
            }
        }
    }
}