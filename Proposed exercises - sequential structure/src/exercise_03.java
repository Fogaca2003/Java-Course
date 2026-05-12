import java.util.Locale;
import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name1, name2;
        int age1, age2;
        double media;

        name1 = sc.nextLine();
        age1 = sc.nextInt();
        sc.nextLine();
        name2 = sc.nextLine();
        age2 = sc.nextInt();

        media = (double) (age1 + age2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos" , name1 , name2, media);

        sc.close();
    }
}
