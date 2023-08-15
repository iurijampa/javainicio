public class Input3 {
    public static void main(String[] args) {
        int nota1 = 9;
        int nota2 = 10;
        int nota3 = 6;
        double total;
        double dividir;

        total = (nota1 + nota2 + nota3);
        dividir = (total / 3);
            if (dividir>6) {
            System.out.println("Aprovado");
        }
            else {
            System.out.println("Reprovado");
        }
    }
}