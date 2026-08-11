import java.util.Scanner;

public class exercicio_resolvido_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vet = new int[n];
        int soma = 0;

        for (int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (vet[i] % 2 == 0){
                System.out.printf("%d " ,vet[i]);
                soma += 1;
            }
        }
        System.out.println();
        System.out.println(soma);
    }
}
