package Main;

import dataStructure.Queue;

import java.util.Random;

public class FilaDeAtendimento {

    public static void main(String[] args) {

        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);

        //Criando a fila e armazenando o cliente na fila
        Queue queue = new Queue(cliente);

        System.out.println("Chegou o cliente " + cliente);

        //Simula a chegada do clientes
        for(int i = 2; i <= n; i++){

            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente " + cliente);
            //Enfileirar os próximos clientes
            queue.enqueue(cliente);

        }

        //Atendimento dos clientes
        //Desenfileirar a fila até que a mesma se encontre vazia

        var node = queue.dequeue();
        while(node != null){
            System.out.println("Atendido o cliente " + node.getValue());
            node = queue.dequeue();
        }
    }
}
