//Criando o package Animais
package Animais;

//Criando a classe Cachorro
public class Cachorro extends Animal{

    //Atributos----------------------------------------------------------------------

    //Declarando as variáveis e os tipos que são utilizadas na classe
    //Utiliza-se o public para que possa ser chamado em qualquer local, porém será usado o private por questões
    //de segurança.
    static int numeroDeCachorros; //Variável estática serve para classes e não para objetos
    private int tamanhoDoRabo;

    //Construtores-------------------------------------------------------------------

    //Construtor padrão com valor default setado acima
    //public Cachorro(){}


    //Construtor adicionado com valores variáveis setados abaixo
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros++;
    }

    //Curiosidade: Caso você pressione Alt + Insert você conseguirá visualizar alguns comandos que poderão ser
    //gerados automaticamente baseado no que você já tem escrito.


    //Métodos------------------------------------------------------------------------

    //Métodos Getter e Setter. São usados quando os atributos são colocados como privados por questões de segurança

    //Através do get você pode decidir quem poderá acessar aquele dado ou, caso queira, passar algum dado diferente
    //do real, o que não é muito interessante, porém é uma opção.
    //Esse exemplo de get e set seria útil caso eu definisse String nome como private e não public.
    public String getNome(){
        return this.nome;
    }

    //O set serve também para validações, o exemplo estará abaixo.
    public void setNome(String nome){
        if(nome.equals("brutus")){
            this.nome = null;
        }
        this.nome =nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    //Criação de método com retorno e sem ação
    //Se atentar que o 'return' tem que ter o parâmetro do mesmo tipo da variável que foi criada
    //no caso, String. Se passar um número no lugar de string, vai dar erro.
    public String pegar(){
        return "Bolinha";
    }

    //Criação de método com retorno e com ação
    public String interagir(String acao){

        switch(acao){

            case "carinho": this.estadoDeEspirito = "Feliz";
            break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo";
            break;
            case "pegar bolinha": this.estadoDeEspirito = "Animado!";
            break;
            default: this.estadoDeEspirito = "Neutro";
            break;
        }

        return this.estadoDeEspirito;
    }

    //Override sobrescreve um método que tá sendo herdado da classe pai e, além disso, serve para avisar
    //em casos de mudanças no código, que alguém está utilizando aquele método e que está diferente do padrão.
    @Override
    public void soar() {
        System.out.println("Au au!!!");
    }
}
