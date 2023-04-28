import java.util.Scanner;

/**
 * Seu Zé está vendendo frutas com a seguinte tabela de preços:
 *
 * Exemplo 1
 *
 *  	Até 5 Kg	Acima de 5 Kg
 * Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
 * Maçã	R$ 1,80 por Kg	R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 * */

public class Desafio2_QuitandaDoZe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt(); //1 = 2,50 //6 = 13,20
        int macas = input.nextInt(); //1 = 1,80 //6 = 9,00

        float valorTotMorango;
        float valorTotMaca;
        float valorTotal;
        float valorPorcentagem;

        //TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

        //calcular o valor

        if (morangos > 5) { //desconto
            valorTotMorango = (float) (morangos * 2.20);
        } else {
            valorTotMorango = (float) (morangos * 2.50);
        }

        if (macas>5) {
            valorTotMaca = (float) (macas * 1.50);
        } else {
            valorTotMaca = (float) (macas * 1.80);
        }

        valorTotal = valorTotMorango + valorTotMaca;

        if (valorTotal > 25 || morangos + macas > 8) //desconto #2
        {
            valorPorcentagem = (valorTotal * 10) / 100;
            valorTotal -= valorPorcentagem;
        }

        System.out.println(valorTotal);

    }
}
