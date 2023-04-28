import java.util.Scanner;

/**
 *
 *
 * Há um país denominado Lolipad,
 * todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
 *
 * Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * */


public class Desafio5_TaxaDeImpostoDeRenda {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;


        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

        /*
        * 1 - Ter de 0 a 2000 lolis no max gera isenção de imposto(por mês)
        * 2 - De 2000,01 a 3000 gera uma taxa de 8%
        * 3 - de 3000 a 4500 lolis gera uma taxa de 18%
        * 4 - e acima disso a taxa é de 28%
        * */

        if (renda <= 2000.0){
            System.out.printf("Isento");
        } else if (renda <= 3000.0) {
            imposto = (renda - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (renda <= 4500.0) {
            imposto = (1000.0 * 0.08) + ((renda - 3000.0)*0.18);
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((renda - 4500.0) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
