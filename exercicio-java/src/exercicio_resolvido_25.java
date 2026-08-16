import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_25 {
    public static void main(String[] argsS){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] matriz = new double[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] > 0){
                    soma+=matriz[i][j];
                }
            }
        }
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        System.out.println("SOMA DOS POSITIVOS: " + soma);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f " , matriz[linha][i]);
        }

        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f " , matriz[i][coluna]);
        }

        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");

        for (int i = 0; i < n; i++){
            System.out.printf("%.1f " , matriz[i][i]);
        }

        System.out.println();

        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] < 0){
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.printf("%.1f " , matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
