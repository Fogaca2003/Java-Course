import java.util.Locale;
import java.util.Scanner;

public class _13_arrays {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Vetores
        int[] idade = new int[3];
        double[] nota = new double[3];
        String[] nome = new String[3];

        // ==========================
        // LENDO OS NOMES
        // ==========================
        System.out.println("Digite 3 nomes:");

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nome[i] = sc.next();
        }

        // ==========================
        // LENDO AS IDADES
        // ==========================
        System.out.println("\nDigite 3 idades:");

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idade[i] = sc.nextInt();
        }

        // ==========================
        // LENDO AS NOTAS
        // ==========================
        System.out.println("\nDigite 3 notas:");

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            nota[i] = sc.nextDouble();
        }

        // ==========================
        // MOSTRANDO OS DADOS
        // ==========================
        System.out.println("\n--- Dados Cadastrados ---");

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.println("Nome : " + nome[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.printf("Nota : %.1f%n", nota[i]);
            System.out.println();
        }

        sc.close();
    }
}
