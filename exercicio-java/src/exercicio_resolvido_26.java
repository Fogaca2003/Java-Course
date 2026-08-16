import java.util.Scanner;

public class exercicio_resolvido_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt();
        fila = fila - 1;

        int ultimo_numero = mat[fila][n - 1];

        for (int i = n-1; i > 0; i --){
            mat[fila][i] = mat[fila][i - 1];
        }

        mat[fila][0] = ultimo_numero;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%d " , mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
