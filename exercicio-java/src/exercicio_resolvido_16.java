import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_16 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] sexo = new char[n];
        int homens = 0;
        double mulehres = 0;
        double alturaMulher = 0;

        for (int i = 0; i < n; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);

            if (sexo[i] == 'M'){
                homens += 1;
            }else {
                alturaMulher += altura[i];
                mulehres += 1;
            }
        }
        double alturaMenor = altura[0];
        double alturaMaior = altura[0];
        for (int i = 0; i < n;  i++){
            if (alturaMaior < altura[i]){
                alturaMaior = altura[i];
            }

            if (altura[i] < alturaMenor){
                alturaMenor = altura[i];
            }
        }

        System.out.println("Menor altura = " + alturaMenor);
        System.out.println("Maior altura " + alturaMaior);
        System.out.printf("Media das alturas das mulheres = %.2f%n" , (alturaMulher/mulehres) );
        System.out.println("Numeros de homens = " + homens);
    }
}
