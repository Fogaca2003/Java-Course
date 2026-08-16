import java.util.Scanner;

public class exercicio_resolvido_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] numero = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                numero[i][j] = sc.nextInt();
            }
        }

        int[] vet = new int[n];

        for (int i = 0; i < n; i++){
            int soma = 0;
            for (int j = 0; j < n; j++){
                soma += numero[i][j];
            }
            vet[i] = soma;
        }

        for (int i = 0; i < n; i++){
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
