public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Maria";
        int idade = 32;
        double renda = 50.000;

        int y = 32;
        double h = 10.25852;

        System.out.printf("%s tem %d anos e tem renda de %.3f reais%n", nome, idade, renda);

        System.out.println(y);

        System.out.println(h);
        System.out.printf("%.2f%n", h);
        System.out.println("Resultado é :" + h + " Metros");
        System.out.printf("Resultado é = %.3f Metros%n", h);

    }
}
