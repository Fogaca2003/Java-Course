void main() {

    int y = 32;
    double x = 10.35784;

    String name = "Maria";
    int age = 31;
    double income = 4000.0;

    IO.println(y);
    System.out.printf("%.2f%n", x);
    System.out.printf("%.4f%n", x);

    Locale.setDefault(Locale.US);
    System.out.printf("%.4f%n", x);

    IO.println("Result = " + x + "meters");
    System.out.printf("Result = %.2f meters%n", x); // %f = floating point - %n = line break

    System.out.printf("%s is %d years old and earns $ %.2f dollars %n", name, age, income);
    // %d = Whole number %s = text

    IO.println("Hello World");
    IO.println("Good Morning");
    IO.println("Good Afternoon");
    IO.print("Good Night"); //Don't jump ship.
    IO.print("/Good evening");

    /*
         JAVA 21
    import java.util.Locale;

    public class Main {

        public static void main(String[] args){

            int y = 32;
            double x = 10.35784;

            String name = "Maria";
            int age = 31;
            double income = 4000.0;

            System.out.println(y);
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);

            Locale.setDefault(Locale.US);
            System.out.printf("%.4f%n", x);

            System.out.println("Result = " + x + "meters");
            System.out.printf("Result = %.2f meters%n" , x); // %f = floating point - %n = line break

            System.out.printf("%s is %d years old and earns $ %.2f dollars %n", name, age, income);
            // %d = Whole number %s = text

            System.out.println("Hello World");
            System.out.println("Good Morning");
            System.out.println("Good Afternoon");
            System.out.print("Good Night"); //Don't jump ship.
            System.out.print("/Good evening");


        }
    }
    */

}