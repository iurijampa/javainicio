import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double total;
        double dividir;
        System.out.print("Digite a primeira nota:");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota:");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota:");
        nota3 = scan.nextDouble();
        total = (nota1 + nota2 + nota3);
        dividir = (total / 3);
        if (dividir>6) {
            System.out.println("Aprovado com a nota: " + dividir);
        }
        else {
            System.out.println("Reprovado com a nota: " + dividir);
        }
    }
}
