import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Tabuada de 1 a 10 com um laço.
        /*for(int i = 1; i <= 10; i++){
            for(int j = 1; j<= 10; j++){
                System.out.println(j + " x " + i + " = " + j * i);
            }
        }*/

        //Declarando e iniciando arrays(vetores)
        /*int[] numero = new int [5];

        for(int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }*/

        //String[] letras = {"A", "B", "C", "D", "E", "F"};
        /*for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }*/
        //System.out.println(Arrays.toString(letras));

        //Descobrindo maior e menor elemento dentro de um array.
        int[] numeros = {9, 20, 156, 120, 29348};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }

            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numeros.length);
    }
}