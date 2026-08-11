import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_15 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] n1 = new double[n];
        double[] n2 = new double[n];
        double[] media = new double[n];


        for (int i = 0; i < n; i++){
            nomes[i] = sc.next();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
            media[i] = (n1[i] + n2[i]) / 2;
        }
        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i++){
            if (media[i] >= 6.00){
                System.out.printf("%s%n" ,nomes[i]);
            }
        }
    }
}
