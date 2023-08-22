import java.util.Random;
import java.util.Scanner;
public class Javaaula2 {

    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        int op;
        do{

            System.out.print("Olá, tudo bem? Para facilitar nosso atendimento digite o NÚMERO DA OPÇÃO DESEJADA\n\n");
            System.out.print(" Opção 1 - Comprar item    \n");
            System.out.print(" Opção 2 - Solicitar valor do produto\n");
            System.out.print(" Opção 3 - Falar com um atendente        \n");
            System.out.print("\nDigite uma opção: ");
            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nCerto! Qual item você deseja comprar:\n");
                    System.out.print("1 - Camisa \n");
                    System.out.print("2 - Mochila \n");
                    System.out.print("3 - Cartão de Visita \n");
                    System.out.print("4 - Retornar ao Menu \n");
                    System.out.print("\nDigite uma opção: ");
                    break;
                case 2:
                    System.out.println("Certo! Você quer solicitar um valor do produto\n");
                    System.out.println("Qual produto você deseja?\n");
                    System.out.print("1 - Camisa \n");
                    System.out.print("2 - Mochila \n");
                    System.out.print("3 - Cartão de Visita \n");
                    System.out.print("4 - Retornar ao Menu \n");
                    System.out.print("\nDigite uma opção: ");
                    break;

                case 3:
                    System.out.println("Certo! Você quer falar com um atendente!\n");
                    System.out.println("Aguarde um momento! Em instantes você será atendido...\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!\n");
                    break;
            }
            op = menu.nextInt();
            }while(op!= 0 || op != 1 || op!= 2 || op!= 3);

        }
    }
