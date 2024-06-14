public class Main {

    /*public static void main(String[] args) {

        String nomeOriginal = "Felipe";
        saudacao(nomeOriginal);

    }

    //Curiosidade do Java: as variáveis dentro de cada escopo tem, necessariamente, que ter o mesmo
    //parâmetro(nome). Porém, mesmo em escopos diferentes, a função consegue ser chamada, mesmo que
    //cada uma tenha o seu próprio parâmetro

    public static void saudacao(String nomeParametro){
        System.out.println("Olá, " + nomeParametro);
    }*/

    public static void main(String[] args){

        int resultado = soma(2, 3);
        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}