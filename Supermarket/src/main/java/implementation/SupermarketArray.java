package implementation;

public class SupermarketArray implements Supermarket{

    private final String[] itens;

    private int lastIndex;

    //Recebe como parâmetro a quantidade de elementos no array(vetor)
    public SupermarketArray(final int size) {
        //Inicializa o array(vetor) itens
        itens = new String[size];
        //lastIndex = Último elemento inserido no array, como ainda não há elementos inseridos, o valor será negativo
        lastIndex = -1;
    }

    //Adicionar um item à lista do supermercado, no caso, ao array que foi criado anteriormente
    @Override
    public void add(String item) {
        //Caso a lista esteja cheia, não será possível adicionar o item
        if(lastIndex == itens.length-1){
            System.err.println("Lista de supermercado cheia!");
        //Caso contrário, o item será adicionado e aumentará um elemento no array(vetor)
        }else{
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    //Mostrar os elementos da lista do supermercado
    @Override
    public void print() {
        System.out.println("################################");
        //Caso o último elemento seja menor do que 0, ou seja, -1, a lista estará vazia
        if(lastIndex < 0){
            System.out.println("Lista de supermercado vazia.");
        }
        //Se não estiver vazia, entrará em um laço e mostrará todos os elementos dessa lista
        for(int i = 0; i <= lastIndex; i++)
            System.out.println(i + " - " + itens[i]);
        System.out.println("################################");
    }

    @Override
    public void delete(int index) {
        //Primeiro verifica se o índice é válido
        if(index >= 0 && index <= lastIndex){
            //A operação shift elimina elementos de um array e os puxa da direita para a esquerda
            //para preencher o vazio causado pela deleção do elemento anterior
            //Caso necessário, dê Alt + Enter para o IntelliJ fazer a criação automática do método
            shift(index);
            lastIndex--;
        }else{
            System.err.println("Índice inválido: " + index);
        }
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++){
            //O i + 1 representa o elemento seguinte ao que foi deletado, para ser puxado à direita
            //e preencher o vazio
            itens[i] = itens[i + 1];
        }
    }
}
