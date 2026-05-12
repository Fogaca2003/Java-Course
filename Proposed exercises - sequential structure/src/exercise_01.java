import java.util.Locale;
import java.util.Scanner;

public class exercise_01 {
    public static void  main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, l, area, value, total_value;
        c = sc.nextDouble();
        l = sc.nextDouble();
        value = sc.nextDouble();;

        area = c * l;
        total_value = value * area;

        System.out.printf("AREA = %.2f%n" , area);
        System.out.printf("PRECO = %.2f%n", total_value);



        sc.close();
    }
}
