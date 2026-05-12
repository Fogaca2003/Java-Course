import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double b, h, area, perimeter, diagonal;
        b = sc.nextDouble();
        h = sc.nextDouble();

        area = b * h;
        perimeter = 2 * (b+h);
        diagonal = Math.sqrt(Math.pow(b,2) + Math.pow(h,2));


        System.out.printf("AREA = %.4f%n" , area);
        System.out.printf("PERIMETER = %.4f%n" , perimeter);
        System.out.printf("DIAGONAL = %.4f%n" ,diagonal);



        sc.close();
    }
}
