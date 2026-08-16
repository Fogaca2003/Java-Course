import java.util.Scanner;

public class exercicio_resolvido_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] number = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                number[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            int maior = number[i][0];
            for (int j = 0; j < n; j++){
                if (maior < number[i][j]){
                    maior = number[i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();
    }
}
