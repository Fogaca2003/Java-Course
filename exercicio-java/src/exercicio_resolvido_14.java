import java.util.Scanner;

public class exercicio_resolvido_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++){
            nomes[i] = sc.next();
            idade[i] = sc.nextInt();
        }
        int maior = idade[0];
        String MaisVelho = "";
        for (int i = 0; i < n; i++){
            if (idade[i] > maior){
             maior = idade[i];
             MaisVelho = nomes[i];
            }
        }

        System.out.printf("Pessoa mais velha: %s" ,  MaisVelho);
    }
}
