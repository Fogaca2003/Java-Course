import java.util.Scanner;

public class exercicio_resolvido_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] numeros = new int[n][n];
        int negativos = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("DIAGONAL PRINCIPAL");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == i){
                    System.out.printf("%d ", numeros[i][j]);
                }
                if (numeros[i][j] < 0){
                    negativos++;
                }
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);



        sc.close();
    }
}
