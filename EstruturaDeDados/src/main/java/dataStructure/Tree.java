package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    //Nó raíz
    public Node root;

    public static class Node{

        public int value;
        public Node left;
        public Node right;

        //Construtor que armazenará o valor nesse nó
        public Node(int value){
            this.value = value;
        }

        //Identifica se o nó é uma folha ou não
        public boolean isLeaf(){
            return (this.left == null) && (this.right == null);
        }
    }

    //Inserir valores na árvore
    public void insert(int value){
        if(root == null) root = new Node(value);
        else{

            //Cria-se o novo nó que queremos adicionar
            Node newNode = new Node(value);

            //Utilizando uma fila(Queue<>) ligada(LinkedList<>()) do próprio Java
            //Fila de nós <Node>
            Queue<Node> queue = new LinkedList<>();
            //Adiciona na fila o nó raíz = root
            queue.add(root);

            //Enquanto a fila tiver elementos
            while(queue.size() > 0){
                //Lê o elemento da fila e o retira
                Node currentNode = queue.remove();

                //Se o nó estiver vazio, adiciona o elemento na posição esquerda(left)
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                //Se não estiver vazio, adiciona à fila o lado esquerdo(left)
                }else{
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                    //Se não estiver vazio, adiciona à fila o lado direito(right)
                }else{
                    queue.add(currentNode.right);
                }
            }
        }
    }

    //Chamando os elementos do nó em pré ordem = Raiz - Esquerda - Direita
    public void preOrder(){

        preOrder(root);

    }

    //Método de forma recursiva
    private void preOrder(final Node node) {

        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    //Chamando os elementos do nó em ordem = Esquerda - Raiz - Direita
    public void inOrder(){

        inOrder(root);

    }

    //Método de forma recursiva
    private void inOrder(final Node node) {

        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    //Chamando os elementos do nó pós ordem = Esquerda - Direita - Raiz
    public void posOrder(){

        posOrder(root);

    }

    //Método de forma recursiva
    private void posOrder(final Node node) {

        if(node == null) return;
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.value);
    }


    public void BFS(){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        //Enquanto a fila NÃO '!' estiver vazia 'isEmpty()
        while(!queue.isEmpty()){

            //Desenfileira a fila, removendo elementos, evitando que o laço fique infinito
            Node node = queue.remove();
            //Adiciona os filhos do nó que estão sendo lidos
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }


    public static void main(String[] args) {
        
        Tree tree = new Tree();
        
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println("##################");
        tree.BFS();
        System.out.println("##################");

        /*System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);

        System.out.println(tree.root.isLeaf());
        System.out.println(tree.root.right.isLeaf());*/

    }


}
