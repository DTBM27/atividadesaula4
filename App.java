import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 5;
        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] medias = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do aluno " + (i + 1) + ": ");
            notas1[i] = scanner.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i + 1) + ": ");
            notas2[i] = scanner.nextDouble();

            medias[i] = (notas1[i] + notas2[i]) / 2;

            scanner.nextLine();
        }

        System.out.println("\nListagem de Alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Nota 1: " + notas1[i]);
            System.out.println("Nota 2: " + notas2[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }

        scanner.close();
    }
}