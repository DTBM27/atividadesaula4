import java.util.Scanner;

public class ArmazenarNomes {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        int numAlunos = 15;
        String[] nomes = new String[numAlunos];
        double[] notasPR1 = new double[numAlunos];
        double[] notasPR2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        String[] situacoes = new String[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a nota da PR1 do aluno " + (i + 1) + ": ");
            notasPR1[i] = scanner.nextDouble();

            System.out.println("Digite a nota da PR2 do aluno " + (i + 1) + ": ");
            notasPR2[i] = scanner.nextDouble();

            medias[i] = Math.round((notasPR1[i] + notasPR2[i]) / 2);

            if (medias[i] >= 6) {
                situacoes[i] = "AP";
            } else {
                situacoes[i] = "RP";
            }
            scanner.nextLine();
        }

        System.out.println("\nListagem de Alunos:");
        System.out.println("Nome\tNota PR1\tNota PR2\tMédia\tSituação");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(nomes[i] + "\t" + notasPR1[i] + "\t\t" + notasPR2[i] + "\t\t" + medias[i] + "\t" + situacoes[i]);
        }

        scanner.close();
    }
}