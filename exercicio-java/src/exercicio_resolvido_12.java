import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_12 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vet = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++){
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        double divisao = soma / n;
        System.out.println(divisao);

        for (int i = 0; i < n; i++){
            if (divisao > vet[i]){
                System.out.println(vet[i]);
            }
        }

    }
}
