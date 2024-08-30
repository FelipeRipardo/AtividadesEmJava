import java.util.Scanner;

public class Main {

    //Questão 1
    //Create a boolean method to check if the number belongs to Fibonacci's sequence
    /*public static boolean isFibonacci(int n){

        //Create a decision to check if the number is valid
        if(n < 0) return false;

        //Iniciate the variables to calculate the sequence and print
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci's sequence: ");

        //Create a loop to perform the Fibonacci's sequence correctly
        while(c <= n){
            System.out.print(c + ", ");
            if(c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }

        //New line after the sequence's impression
        System.out.println();
        return false;
    }

    //Main method to call and run the sequence
    public static void main(String[] args) {

        //Create a Scanner for the user enter a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number that you want to check: ");
        int number = scan.nextInt();

        //Check if the number belongs or not to the sequence
        if(isFibonacci(number)){
            System.out.println("\nThe number belongs to Fibonacci's sequence.");
        }else{
            System.out.println("The number doesn't belong to Fibonacci's sequence.");
        }
    }*/

    //Questão 2
    /*public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string or text: ");
        String text = scan.nextLine();

        int count = 0;

        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
                if(currentChar == 'a' || currentChar == 'A'){
                    count++;
            }
        }

        if(count > 0){
            System.out.println("The letter A appears " + count + " times.");
        }else{
            System.out.println("The letter A wasn't found in the string");
        }
    }*/

    //Questão 3

    /*public static void main(String[] args) {

        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k < indice){
            k += 1;
            soma += k;
        }

        System.out.println("A soma é: " + soma);
        //O resultado é 77.
    }*/

    //Questão 4
    /*
    a)1, 3, 5, 7, __ -> A resposta é 9, pois soma de 2 em 2

    b)2, 4, 8, 16, 32, 64, __ -> A resposta é 128, pois multiplica de 2 em 2

    c)0, 1, 4, 9, 16, 25, 36, __ -> A resposta é 49, pois soma os números ímpares posteriores
    como 1, 3, 5, 7, 9...

    d)4, 16, 36, 64, __ -> A resposta é 100, pois aumenta a soma de 8 em 8, começando do número 12.
    12, 20, 28, 36...

    e)1, 1, 2, 3, 5, 8, __ -> A resposta é 13, pois segue a sequência de Fibonacci.

    f)2, 10, 12, 16, 17, 18, 19, __ -> A resposta é 200, pois cada número começa com a letra D.

     */

    //Questão 5
    /*
    - Ligo o primeiro interruptor e deixo ligado por um tempo.
    - Em seguida, desligo o primeiro interruptor e ligo o segundo interruptor
    - Entro na sala onde estão as lâmpadas.


    - Se uma lâmpada estiver acesa, então o segundo interruptor controla essa lâmpada.
    - Se a lâmpada estiver desligada e estiver quente se eu tocar, então o primeiro interruptor controla essa lâmpada.
    - Se a lâmpada estiver desligada e estiver fria quando eu tocar, então o terceiro interruptor controla essa lâmpada.
     */
}