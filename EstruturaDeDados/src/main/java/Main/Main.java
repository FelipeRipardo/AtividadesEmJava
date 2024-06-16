package Main;

import dataStructure.Stack;

public class Main {

    public static void main(String[] args) {

        //Vetor de números inteiros
        int[] numeros = {5, 4, 3, 2, 1};

        inverter(numeros);
    }

    //Método inverter
    private static void inverter(final int[] numeros){

        //Ler o vetor e armazenar dentro de uma pilha
        Stack stack = new Stack(numeros[0]);

        for(int i = 0; i < numeros.length; i++){
            stack.push(numeros[i]);
        }

        //Após empilhar, desempilha os elementos e eles serão mostrados na ordem invertida
        var node = stack.pop();
        while(node != null){
            System.out.println(node.getValue());
            node = stack.pop();
        }
    }
}
