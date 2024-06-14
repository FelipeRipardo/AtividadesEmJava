//Fazendo import da classe Animais
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Animais.Animal;
import Lojas.Petshop;

//Curiosidade: Se você selecionar uma linha e pressionar Alt + Shift, consegue movimentar a linha
//para qualquer lugar do código. É bom para movimentar o código e realizar testes.

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Zyra", "Caramelo", 45, 12.5, "neutro", 15);
        Gato gato1 = new Gato("Bibi", "Branco com cinza", 15);
        Passaro passaro1 = new Passaro("Pip", "Branco", 0.3);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}