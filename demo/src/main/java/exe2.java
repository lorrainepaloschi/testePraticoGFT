import java.util.Collections;
import java.util.Scanner;

/* Escreva um programa onde o usuário digite um valor inteiro e o programa escreva a
música do “Elefante incomoda” correspondente ao valor digitado:
Exemplo: Usuário digitou o nº 3
Saída: Incomoda Incomoda Incomoda muito mais */

public class exe2 {
    public static void main(String args[]){

        int a;
        Scanner recebe = new Scanner(System.in);

        a = recebe.nextInt();

        System.out.println(String.join("", Collections.nCopies(a, "Incomoda ")) + "muito mais");
    }

}