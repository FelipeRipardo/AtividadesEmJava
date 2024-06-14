package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso){
        super(nome, cor, peso);
    }

    //Override sobrescreve um método que tá sendo herdado da classe pai e, além disso, serve para avisar
    //em casos de mudanças no código, que alguém está utilizando aquele método e que está diferente do padrão.
    @Override
    public void soar() {
        System.out.println("Miau miau!!!");
    }
}
