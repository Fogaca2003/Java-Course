import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1,n2,m;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        m = (n1 + n2) ;

        System.out.printf("NOTA FINAL = %.1f%n" , m);

        if (m < 60){
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}