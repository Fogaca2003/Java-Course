import java.util.Scanner;

public class _15_array_reinforcement_exercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] email = new String[n];
        int[] room = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Email: ");
            email[i] = sc.next();
            System.out.print("Room: ");
            room[i] = sc.nextInt();
        }
        System.out.println("Busy rooms");
        for (int i = 0; i < n; i++){
            System.out.printf("%d: %s, %s%n" , room[i] , name[i] , email[i]);
        }

        sc.close();
    }
}
