package dataStructure;

public class BinarySearchTree {

    public Node root;

    public class Node{

        public int value;
        public Node left;
        public Node right;

        //Construtor que recebe o valor do nó
        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        if(root == null){
            //A raíz aponta para um novo nó
            root = new Node(value);
        }else{
            //Chama um método de inserção recursivo
            insert(root, value);
        }
    }

    private void insert(final Node root, final int value) {
        if(root == null) return;//Não retorna nada
        if(value == root.value) return;//Não retorna nada

        if(value > root.value){
            if(root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        }else{
            if(root.left == null) root.left = new Node(value);
            else insert(root.left, value);

        }
    }

    //Caso utilize a busca em ordem em uma árvore binária, será retornado os elementos em ordem crescente
    public void inOrder(){

        inOrder(root);

    }

    private void inOrder(final Node node) {

        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    //Método recursivo de busca
    public boolean contains(int value){
        return contains(root, value);
    }

    /*Caso o valor da raíz seja nulo, retorna falso, se a raíz contém aquele valor, retorna true
    Se o valor buscado for maior que o valor da raíz, retorna a chamada do contains pro lado direito
    Senão, retorna o contains pro lado esquerdo*/
    private boolean contains(final Node root, final int value) {
        if(root == null) return false;
        if(root.value == value) return true;
        if(value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    //Menor valor fica na folha mais à esquerda
    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    //Remover o nó de uma árvore, levando em conta se é folha, nó incompleto ou completo
    public void deleteNode(int value){
        root = deleteNode(root, value);
    }

    private Node deleteNode(final Node root, final int value) {
        if(root == null) return null;

        /*Se o nó que será deletado está do lado esquerdo de uma árvore, o lado esquerdo será igual àquela
        árvore com o nó deletado*/
        if(value < root.value){
            root.left = deleteNode(root.left, value);
        //Senão,  faz o inverso. Se o lado direito será igual àquela árvore com o nó deletado*/
        }else if(value > root.value){
            root.right = deleteNode(root.right, value);

        //Se o nó for uma folha
        }else{
            if((root.left == null) && (root.right == null)){
                return null;

            //Nó incompleto, caso possua apenas lado direito ou lado esquerdo
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;

            //Nó completo, quando se tem ambos os lados
            }else{
                //Pega o menor valor sempre da subárvore direita e copia para o valor corrente
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
        return root;
    }


    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(2);
        tree.insert(5);
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(67);
        tree.insert(24);

        tree.deleteNode(10);
        tree.inOrder();
    }
}
