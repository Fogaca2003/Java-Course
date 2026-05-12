void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String x, s1, s2, s3;
    int x1, y;
    double x2;
    char x3;

    x = sc.next();
    x1 = sc.nextInt();
    x2 = sc.nextDouble();
    x3 = sc.next().charAt(0);


    IO.println("You typed " + x);
    IO.println("You typed " + x1);
    System.out.printf("You typed %.2f%n", x2);
    IO.println("You typed " + x3);

    y = sc.nextInt();
    sc.nextLine();
    //When you use a read command other than nextLine()
    // and create a line break,
    // that line break remains "pending" in standard input.
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();
    IO.println("Data entered:");
    IO.println(y);
    IO.println(s1);
    IO.println(s2);
    IO.println(s3);


    sc.close();
}
/*
Java 21

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x, s1, s2, s3;
        int x1, y;
        double x2;
        char x3;

        x = sc.next();
        x1 = sc.nextInt();
        x2 = sc.nextDouble();
        x3 = sc.next().charAt(0);


        System.out.println("You typed "+ x);
        System.out.println("You typed "+ x1);
        System.out.printf("You typed %.2f%n", x2);
        System.out.println("You typed "+ x3);

        y = sc.nextInt();
        sc.nextLine();
        //When you use a read command other than nextLine()
        // and create a line break,
        // that line break remains "pending" in standard input.
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Data entered:");
        System.out.println(y);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}

 */