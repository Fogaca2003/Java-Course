import java.util.Locale;
import java.util.Scanner;

public class _07_conditional_structure {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hour;

        System.out.println("what time is?");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Good Morning");
        } else {
            if (hour < 18) {
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Night");
            }

            sc.close();
        }
    }
}