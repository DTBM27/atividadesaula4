import java.util.Scanner;

public class AnaliseLucroMercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
            String data = scanner.nextLine();

            if (data.equals("9999")) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (data.length() != 4) {
                System.out.println("Formato de data inválido. Por favor, digite ddmm ou 9999 para sair.");
                continue;
            }

            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(2));

            String horoscopo = determinarHoroscopo(dia, mes);
o
            System.out.println("O seu horóscopo é: " + horoscopo);
        }

        scanner.close();
    }

    public static String determinarHoroscopo(int dia, int mes) {

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        }
        return "Signo não encontrado";
    }
}