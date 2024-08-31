import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("|     | Welcome to Console X Pokemon |     |");
        System.out.println("============================================");
        System.out.print("Enter your player name: ");

        String userName = scanner.nextLine();
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("Welcome to Pokemon World, " + userName);
        System.out.println(" ");
        System.out.println("Since you are a new pokemon trainer, we will\n give you a free! pokemon!!");
        System.out.println("============================================");
        System.out.println("Press any key to proceed...");
        System.in.read();
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("| Choose your partner, " + userName + " |");
        System.out.println("1.Pikachu");
        System.out.println("-Stats (Electric, normal)");
        System.out.println("2.Ember");
        System.out.println("-Stats (Fire, normal)");
        System.out.println("3.Onyx");
        System.out.println("-Stats (Rock, normal)");
        System.out.println("============================================");
        System.out.print("Enter your choice: ");
        int userChoice = scanner.nextInt();
//        switch (userChoice) {
//            case 1:
//                System.out.println("s");
//                break;
//            case 2:
//                System.out.println("s");
//                break;
//        }
    }
}