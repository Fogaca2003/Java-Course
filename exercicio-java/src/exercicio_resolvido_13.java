import java.util.Scanner;

public class exercicio_resolvido_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vet = new int[n];
        double soma = 0;
        int Nmedia = 0;

        for (int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0){
                soma += vet[i];
                Nmedia += 1;
            }
        }

        System.out.println(soma / Nmedia);
    }
}
