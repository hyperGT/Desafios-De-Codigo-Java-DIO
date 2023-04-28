import java.util.Scanner;

/**
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo
 * o esquema abaixo, da esquerda para a direita. Em seguida conclua qual dos animais seguintes
 * foi escolhido, através das três palavras fornecidas.
 * */

public class Desafio1_Animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.
        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) System.out.println("aguia");

                if (AN3.equals("onivoro")) System.out.println("pomba");
            }

            if (AN2.equals("mamifero")) {

                if (AN3.equals("onivoro")) System.out.println("homem");

                if (AN3.equals("herbivoro")) System.out.println("vaca");
            }
        }

        if (AN1.equals("invertebrado")) {
            if (AN2.equals("inseto")) {

                if (AN3.equals("hematofago")) System.out.println("pulga");

                if (AN3.equals("herbivoro")) System.out.println("lagarta");

            }

            if (AN2.equals("anelideo")) {

                if (AN3.equals("hematofago")) System.out.println("sanguessuga");

                if (AN3.equals("onivoro")) System.out.println("minhoca");
            }
        }

    }
}


