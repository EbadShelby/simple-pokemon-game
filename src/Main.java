import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Pokemon pikachu = new Pokemon("Pikachu", "electric", "normal", 1, 12, "iron tail", 3);
        Pokemon ember = new Pokemon("Ember", "fire", "normal", 1, 10, "flame burst", 5);
        Pokemon eevee = new Pokemon("Eevee", "grass", "normal", 1, 11, "leaf blade", 4);


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
        System.out.println(" ");
        System.out.println("1. " + pikachu.name);
        System.out.println("- Stats -");
        System.out.println("Type: " + pikachu.type);
        System.out.println("Rarity: " + pikachu.rarity);
        System.out.println("Level: " + pikachu.level);
        System.out.println("Hp: " + pikachu.hp);
        System.out.println("Skill-1: " + pikachu.skill01 + " > Damage: " + pikachu.skill01Damage);
        System.out.println(" ");
        System.out.println("2. " + ember.name);
        System.out.println("- Stats -");
        System.out.println("Type: " + ember.type);
        System.out.println("Rarity: " + ember.rarity);
        System.out.println("Level: " + ember.level);
        System.out.println("Hp: " + ember.hp);
        System.out.println("Skill-1: " + ember.skill01 + " > Damage: " + ember.skill01Damage);
        System.out.println(" ");
        System.out.println("3. " + eevee.name);
        System.out.println("- Stats -");
        System.out.println("Type: " + eevee.type);
        System.out.println("Rarity: " + eevee.rarity);
        System.out.println("Level: " + eevee.level);
        System.out.println("Hp: " + eevee.hp);
        System.out.println("Skill-1: " + eevee.skill01 + " > Damage: " + eevee.skill01Damage);
        System.out.println("============================================");
        System.out.print("Enter your choice: ");
        System.out.println(" ");
        int userFirstPokemon = scanner.nextInt();
        String userPokemon;
        switch (userFirstPokemon) {
            case 1:
                userPokemon = pikachu.name;
                System.out.println("============================================");
                System.out.println("Congratulation!!!");
                System.out.println("Your new pokemon, " + userPokemon + "!");
                System.out.println(" ");
                System.out.println("It's time to go for an adventure!");
                System.out.println("Do your best " + userName);
                System.out.println("...");
                System.out.println("============================================");
                break;
            case 2:
                userPokemon = ember.name;
                System.out.println("============================================");
                System.out.println("Congratulation!!!");
                System.out.println("Your new pokemon, " + userPokemon + "!");
                System.out.println(" ");
                System.out.println("It's time to go for an adventure!");
                System.out.println("Do your best " + userName);
                System.out.println("...");
                System.out.println("============================================");
                break;
            case 3:
                userPokemon = eevee.name;
                System.out.println("============================================");
                System.out.println("Congratulation!!!");
                System.out.println("Your new pokemon, " + userPokemon + "!");
                System.out.println(" ");
                System.out.println("It's time to go for an adventure!");
                System.out.println("Do your best " + userName);
                System.out.println("...");
                System.out.println("============================================");
                break;
        }
    }
}