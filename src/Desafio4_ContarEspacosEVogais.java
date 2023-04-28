import java.util.Scanner;

/**
 * Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!*/

public class Desafio4_ContarEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
            //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
            for (int i = 0 ; i < item.length() ; i++){
                char c = Character.toLowerCase(item.charAt(i));
                if (c == ' ') {
                    espacosEmBranco++;
                } else {
                    for (int j = 0; j < arrVogais.length; j++) {
                        if (c==arrVogais[j]) {
                            quantVogais++;
                            break;
                        }
                    }
                }
            }

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
    }
