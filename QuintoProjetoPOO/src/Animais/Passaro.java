package Animais;

import com.sun.security.jgss.GSSUtil;

public class Passaro extends Animal{

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    //Override sobrescreve um método que tá sendo herdado da classe pai e, além disso, serve para avisar
    //em casos de mudanças no código, que alguém está utilizando aquele método e que está diferente do padrão.
    @Override
    public void soar() {
        System.out.println("Fiu fiu!!!");
    }
}
