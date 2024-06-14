package dataStructure;

import java.sql.SQLOutput;

public class LinkedList {

    //Lembrando que a Cabeça(head) e a Cauda(tail) tem que ser valores fixos.
    //Cabeça da lista ligada
    private Node head;
    //A cauda da lista ligada
    private Node tail;
    //O tamanho da lista ligada
    private int length;

    class Node{

        //Cada nó armazena uma informação
        String data;
        //E tem um apontador que referencia o próximo nó, que é NULL
        Node next;

        //O construtor recebe uma informação -> data e armazena o nó
        Node(String data){
            this.data = data;
        }
    }


    //Implementar o construtor da lista ligada e, da mesma forma que o nó, ela, obrigatoriamente
    //precisa ter uma informação a ser armazenada
    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("Lista vazia.");
        }else{
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista vazia.");
        }else{
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    public void print(){
        //Nó temporário que aponta para a cabeça da lista
        System.out.println("######################");
        Node temp = this.head;

        while(temp != null){
            System.out.println(temp.data);
            //Navegando sempre pro próximo nó
            temp = temp.next;
        }
        System.out.println("######################");
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            //O novo nó se torna a cauda da lista, sendo o último elemento antes do NULL
             tail.next = newNode;
             tail = newNode;
        }
        length++;
    }

    //Remoção do último elemento da lista
    public Node removeLast(){
        //Se a lista estiver vazia retornará um valor NULL
        if(length == 0) return null;
        //Senão, temos que identificar o penúltimo elemento da lista
        Node pre = head;
        Node temp = null;

        //Enquanto o próximo elemento não for o último ele irá passar por toda a lista de forma unidirecional
        while(pre.next != tail){
            pre = pre.next;
        }
        //Quando ele encontra o último elemento o último será igual ao penúltimo e o próximo do último será vazio
        //Antes de ser apagado, deverá mostrar o elemento que será removido
        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            //O próximo elemento do novo nó será o início da lista atual
            newNode.next = head;
            //E o início da lista será o novo nó
            head = newNode;
        }
        //Incrementar o tamanho atual
        length++;
    }

    //Remover o nó do início da lista
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Ler uma posição no índice da lista
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Inserir um elemento em um nó específico
    public boolean insert(int index, String data){
        if(index < 0 || index > length) return false;
        //Se o índice estiver no início da lista, será executado um prepend
        if(index == 0){
             prepend(data);
             return true;
        }
        //Se o índice estiver no final da lista, será executado um append
        if(index == length){
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        //Pegará o elemento no índice anterior
        Node temp = get(index - 1);
        //Novo nó pontará para quem o elemento  anterior estará apontando
        newNode.next = temp.next;
        temp.next = newNode;

        length++;
        return true;

    }

    //Altera o elemento de um nó, facilitando o uso através do get
    public boolean set(int index, String data){
        Node temp = get(index);
        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    //Remover um elemento em um índice específico
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) removeFirst();
        if(index == length) removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        //O próximo do anterior será o próximo de quem será removido
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.remove(2);



        //list.insert(3, "Elemento 2.5");



        //System.out.println(list.get(3).data);

        //System.out.println(list.removeFirst().data);
        list.print();

        //list.set(1, "Elemento 0.5");

        //list.print();

        /*list.getHead();
        list.getTail();
        list.getLength();
        list.print();*/
    }
}
