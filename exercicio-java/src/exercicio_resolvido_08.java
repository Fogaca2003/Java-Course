import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_08 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = sc.nextInt();
        String[] nome = new String[contador];
        int[] idade = new  int[contador];
        double[] altura = new double[contador];
        double somaAltura = 0;
        int somaIdade = 0;


        for(int i = 0 ; i < contador ; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
            somaAltura +=  altura[i];
            if (idade[i] < 16){
                somaIdade += 1;
            }
        }
        double porcentagemIdade = (double) (somaIdade * 100.0) / contador;
        System.out.printf("Altura media: %.2f%n" , (somaAltura/contador));
        System.out.printf("Pessoas com menos de 16 anos: %.1f %%" , porcentagemIdade);

        sc.close();
    }
}
