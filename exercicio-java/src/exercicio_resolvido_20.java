import java.util.Scanner;

public class exercicio_resolvido_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] n = new int[l][c];

        for (int i = 0; i < l; i++){
            for (int j = 0; j < c; j++){
                n[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS: ");
        for (int i = 0; i < l; i++){
            for (int j = 0; j < c; j++){
                if (n[i][j] < 0){
                    System.out.println(n[i][j]);
                }
            }
        }


        sc.close();
    }
}
