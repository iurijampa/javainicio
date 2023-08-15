public class FolhaPagamento {
    public static void main(String[] args) {
        double salario1 = 2500.00;
        double desc = 0;

        if (salario1<=900.00) {
            System.out.println("Isento de desconto");
        }else if (salario1 > 901 && salario1 <= 1500) {
            desc = (5.0 / 100) * salario1;
            System.out.println("Você recebe de 5%");
            System.out.println(desc);
        }else if (salario1 > 1500 && salario1 <= 2500) {
            desc = (10.0 / 100) * salario1;
            System.out.println("Desconto de 10%");
            System.out.println(desc);
        }else {
            desc = (20.0 / 100) * salario1;
            System.out.println("Desconto de 20%");
            System.out.println(desc);
        }
    }
}