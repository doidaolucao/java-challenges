import java.util.Scanner;

public class Main {

    String[] nomes = new String[10];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** SISTEMA DE CADASTRO FUNCIONÁRIO *****");

        // Fazer menu antes para opções.. 1 - Listar funcionarios 2 - Remover 3 - Sair

        System.out.println("Insira seu nome:");
        String nome = input.nextLine();

        System.out.println("Insira sua idade:");
        int idade = input.nextInt();

        input.nextLine();

        System.out.println("Qual o seu cargo na empresa?");
        String cargo = input.nextLine();

        Empregado pessoa = new Empregado(0, nome, idade, cargo);
        pessoa.id++;

        System.out.println("O funcionário " + pessoa.name + " foi cadastrado em nosso sistema! Seu registro de identificação é: " + pessoa.id);



        input.close();
    }
}

class Empregado {
    int id;
    String name;
    int age;
    String role;
    
    public Empregado(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }
}
