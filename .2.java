import java.util.Scanner;

public class 2 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor para cinco nomes
        String[] nomes = new String[5];


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um número de 1 a 5 para selecionar uma pessoa: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 5) {
            int indice = numero - 1;
            System.out.println("O nome da pessoa selecionada é: " + nomes[indice]);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 5.");
        }

        scanner.close();
    }
}
