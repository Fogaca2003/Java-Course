import java.util.Scanner;

public class exercicio_resolvido_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (vet[i] < 0){
                System.out.printf("%d%n", vet[i]);
            }
        }

        sc.close();

    }
}
