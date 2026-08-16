import java.util.Scanner;

public class exercicio_resolvido_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] number = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                number[i][j] = sc.nextInt();
            }
        }
        int soma = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j > i){
                    soma += number[i][j];
                }
            }
        }
        System.out.println(soma);



        sc.close();
    }
}
