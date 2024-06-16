package dataStructure;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public class Node{

        int value;
        Node next;

        Node(int value){
            this.value = value;

        }

        //Para poder ser lido em classes externas, o getValue é criado.
        public int getValue(){
            return this.value;
        }
    }

    public Queue(int value){

        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;

    }

    public void getFirst(){

        if(first != null){
            System.out.println("First: " + first.value);
        }else{
            System.out.println("A fila está vazia.");
        }

    }

    public void getLast(){

        if(last != null){
            System.out.println("Last: " + last.value);
        }else{
            System.out.println("A fila está vazia.");
        }

    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void print(){

        /*Os valores impressos tem que partir do início da fila
        O primero e o último nó só podem ser mexidos no caso de inserir ou remover valores
        Quando for fazer leitura em uma fila, utilizar variável temporária*/

        System.out.println("#########################");
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("#########################");

    }

    //Enfileirar
    public void enqueue(int value){

        Node newNode = new Node(value);

        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    //Defileirar ou remover um elemento. OBS: Só pode ser feito no primeiro nó da fila
    public Node dequeue(){

        if(length == 0) return null;

        //A criação do temp é para armazenar o elemento que foi removido e retornar na chamada do método
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;

        }else{
            first = first.next;
            temp.next = null;
        }
        length--;

        return temp;
    }


    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue(). value);
        System.out.println(myQueue.dequeue(). value);
        System.out.println(myQueue.dequeue(). value);

        /*myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();*/

        myQueue.print();


        /*myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.print();*/
    }
}
