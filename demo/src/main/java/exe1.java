

import java.util.Scanner;



public class exe1 {
    public static void main(String args[]){
        

    int a;
    int b;
    int c;

    Scanner recebe = new Scanner(System.in);
        a = recebe.nextInt();
        b = recebe.nextInt();
        c = recebe.nextInt();
    if(a>b)
    {
        if(a>c)
        {
            System.out.println("O maior valor é: ");
            System.out.println(a);
        }
    }
    else if(b>c)
    {
        System.out.println("O maior valor é: ");
        System.out.println(b);
    }
    else 
    {
        System.out.println("O maior valor é: ");
        System.out.println(c);
    }

    }

}