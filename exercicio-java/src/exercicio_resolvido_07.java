import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_07 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = sc.nextInt();
        double[] vet = new double[contador];
        double soma = 0;

        for (int i = 0; i < contador ; i++){
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        for (int i = 0; i < contador ; i++){
            System.out.printf("%.1f " , vet[i]);
        }
        System.out.println();
        System.out.printf("%.2f%n" ,soma);
        System.out.printf("%.2f%n" , (soma/contador) );

        sc.close();
    }
}
