import java.util.Scanner;

/**
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
 *
 * Perimetro = XX.X
 *
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
 *
 * Area = XX.X
 *
 * Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 * */

public class Desafio3_Triangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;


        /*
         * Exemplo de verificação se é ou não um triangulo:
         * |10 – 9| < 5 < 10 + 9
         * 1 < 5 < 19 (VERDADEIRO)
         *
         * regra:
         * | b - c | < a < b + c
         * | a - c | < b < a + c
         * | a - b | < c < a + b
         * */

        //TODO: Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.

        //verificar se é ou não um triangulo
        triangulo = A + B > C && A + C > B && B + C > A;


        //realizar os calculos e mostrar na tela
        if(triangulo){
            //calculando o perimetro do triangulo
            soma = A + B + C;
            System.out.println("Perimetro = " + String.format("%.1f", soma));
        } else {
            //calculando a area do trapezio
            soma = ((A + B) * C) / 2;
            System.out.println("Area = " + String.format("%.1f", soma));
        }


        

    }
}
