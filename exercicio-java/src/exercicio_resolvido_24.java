import java.util.Scanner;

public class exercicio_resolvido_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];


        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%d " , c[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
