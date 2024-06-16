package dataStructure;

public class Stack {

    //Nó da pilha
    private Node top;
    //Altura da pilha
    private int heigth;


    public class Node{

        int value;
        Node next;

        //Construtor
        Node (int value){
            this.value = value;
        }

        //Obter o valor armazenado em um nó
        public int getValue() {
            return value;
        }
    }

    //Implementar o construtor da pilha que recebe o valor inicial que será armazenado em um nó
    public Stack(int value){
        Node newNode = new Node(value);
        //O nó será o topo da pilha
        top = newNode;
        heigth = 1;
    }

    public void getTop(){
        //Se não houver um valor no topo da pilha, significa que a mesma estará vazia
        if(top == null){
            System.out.println("A pilha está vazia.");
        }else{
            System.out.println("Topo da pilha: " + top.value);
        }
    }

    public void getHeigth(){
        System.out.println("Altura da pilha: " + heigth);
    }

    public void print(){
        //O topo sempre tem que apontar para o primeiro elemento, não se pode mexer nessa variável
        //Por isso se cria uma variável temporária = temp que aponta para o topo
        Node temp = top;

        while(temp != null){
            System.out.println("########################");
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("########################");
    }

    //Inserir elemento no topo da pilha
    public void push(int value){

        Node newNode = new Node(value);
        //Se a altura for 0, o topo será o novo nó
        if(heigth == 0){
            top = newNode;
        //Caso contrário o próximo elemento desse novo nó, será o topo e o novo nó apontará para o topo da pilha
        }else{
            newNode.next = top;
            top = newNode;
        }
        heigth++;

    }

    //Remover um elemento da pilha
    public Node pop(){
        if(heigth == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        heigth--;

        //Retorna o valor que foi removido
        return temp;
    }



    public static void main(String[] args) {

        Stack myStack = new Stack(2);
        myStack.push(1);


        /*System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop() == null);*/


        //myStack.getTop();
        //myStack.getHeigth();

        /*myStack.print();

        myStack.getTop();
        myStack.getHeigth();

        myStack.print();*/
    }

}
