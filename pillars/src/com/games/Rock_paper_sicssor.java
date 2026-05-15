package com.games;

import java.util.Scanner;
import java.util.Random;

public class Rock_paper_sicssor {

    public static void showChoice(int choice) {
        switch (choice) {
            case 1: // ROCK
                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║              ROCK 🪨              ║");
                System.out.println("╚════════════════════════════════════╝");
                System.out.println("            _______                 ");
                System.out.println("        ---'   ____)                ");
                System.out.println("              (_____)               ");
                System.out.println("              (_____)               ");
                System.out.println("              (____)                ");
                System.out.println("        ---.__(___)                 ");
                break;

            case 2: // PAPER
                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║             PAPER 📄              ║");
                System.out.println("╚════════════════════════════════════╝");
                System.out.println("             _______                ");
                System.out.println("         ---'   ____)____           ");
                System.out.println("                   ______)          ");
                System.out.println("                  _______)          ");
                System.out.println("                 _______)           ");
                System.out.println("         ---.__________)            ");
                break;

            case 3: // SCISSORS
                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║           SCISSORS ✂️             ║");
                System.out.println("╚════════════════════════════════════╝");
                System.out.println("             _______                ");
                System.out.println("         ---'   ____)           ");
                System.out.println("                   __)____       ");
                System.out.println("                __________)         ");
                System.out.println("               (____)               ");
                System.out.println("         ---.__(___)                ");
                break;
        }
        System.out.println("\n══════════════════════════════════════\n");
    }

    public static String getChoice(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("==================================================");
        System.out.println("   ROCK PAPER SCISSORS - USER vs COMPUTER");
        System.out.println("==================================================");

        while (playAgain) {
            System.out.println("Choose your option:");
            System.out.println("1. ROCK");
            System.out.println("2. PAPER");
            System.out.println("3. SCISSORS");
            System.out.print("Enter choice (1-3): ");

            int userInput = sc.nextInt();

            if (userInput < 1 || userInput > 3) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("\nYOUR CHOICE:");
            showChoice(userInput);
            
            System.out.println("COMPUTER CHOICE:");
            showChoice(computerChoice);

            // Win/Loss Logic
            if (userInput == computerChoice) {
                System.out.println(" IT'S A TIE!");
            } else if ((userInput == 1 && computerChoice == 3) || 
                       (userInput == 2 && computerChoice == 1) || 
                       (userInput == 3 && computerChoice == 2)) {
                System.out.println(" YOU WIN!");
            } else {
                System.out.println(" COMPUTER WINS!");
            }

            System.out.print("\nPlay again? (y/n): ");
            char response = sc.next().toLowerCase().charAt(0);
            if (response != 'y') {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        sc.close();
    }
}