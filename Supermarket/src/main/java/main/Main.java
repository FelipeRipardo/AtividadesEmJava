package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    //Define uma constante de tamanho 3, que é o tamanho da lista
    private final static int SIZE = 3;
    //Digite psvm e dê enter para o IntelliJ preencher o public static void main com o array de String e args
    public static void main(String[] args) {

        //O Scanner serve para input, ou seja, ler o que o usuário irá digitar e em seguida, armazena
        //o que foi digitado na variável inteira: opcao
        Scanner scanner = new Scanner(System.in);
        //Insere o supermercado no código e inicializa
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;

        //Inicia um laço do while
        do {
            System.out.println("\nLista de compras.");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;

                case 2:
                    supermarket.print();
                    break;

                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");

            }
        } while(opcao != 4);

        scanner.close();
    }
}
