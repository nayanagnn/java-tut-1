// Student 4 - Main program and integration
// the detective types the menu option, suspect id and clue number

import java.util.Scanner;

public class DetectiveGame {

    static Scanner sc = new Scanner(System.in);

    static void showMenu() {
        System.out.println("\n=================================");
        System.out.println("     DETECTIVE INVESTIGATION");
        System.out.println("=================================");
        System.out.println("1. View Suspects");
        System.out.println("2. Investigate Suspect");
        System.out.println("3. Collect Clue");
        System.out.println("4. View Collected Clues");
        System.out.println("5. Accuse Suspect");
        System.out.println("6. Exit");
    }

    // reads a number, keeps asking if user types something else
    static int readNumber(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            if (!sc.hasNext()) {
                return 6;   // input ended, treat as exit
            }
            sc.next();
            System.out.print("Please enter a number: ");
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {

        Suspect[] suspects = Suspect.createSuspects();
        ClueManager clueManager = new ClueManager();
        Investigation inv = new Investigation(suspects);

        System.out.println("An exam question paper has gone missing from the department office!");
        System.out.println("Five students were around at that time. Find out who did it.");

        boolean running = true;

        do {
            showMenu();
            int choice = readNumber("Enter your choice: ");

            switch (choice) {
                case 1:
                    Suspect.displayAll(suspects);
                    break;
                case 2:
                    int id = readNumber("Enter suspect ID (1-5): ");
                    inv.investigate(id);
                    break;
                case 3:
                    clueManager.displayAvailableClues();
                    int clueNo = readNumber("Enter clue number to collect: ");
                    clueManager.collectClue(clueNo);
                    break;
                case 4:
                    clueManager.displayCollectedClues();
                    break;
                case 5:
                    int accuseId = readNumber("Enter ID of the suspect you want to accuse: ");
                    inv.accuse(accuseId);
                    break;
                case 6:
                    System.out.println("Exiting the investigation. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Choose between 1 and 6.");
            }

            if (inv.isOver()) {
                System.out.println("\nInvestigation finished.");
                break;
            }

        } while (running);

        sc.close();
    }
}
