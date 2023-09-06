import java.util.Scanner;

public class AnaliseLucroMercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMercadorias = 100;
        double[] precoCompra = new double[numMercadorias];
        double[] precoVenda = new double[numMercadorias];

        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        for (int i = 0; i < numMercadorias; i++) {
            System.out.println("Digite o preço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra[i] = scanner.nextDouble();

            System.out.println("Digite o preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda[i] = scanner.nextDouble();

            double lucroPercentual = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
            scanner.nextLine();
        }

        System.out.println("\nAnálise de Lucro das Mercadorias:");
        System.out.println("Lucro < 10%: " + lucroMenor10 + " mercadorias");
        System.out.println("10% <= Lucro <= 20%: " + lucroEntre10e20 + " mercadorias");
        System.out.println("Lucro > 20%: " + lucroMaior20 + " mercadorias");

        scanner.close();
    }
}
