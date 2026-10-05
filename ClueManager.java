// Student 2 - Clue Management
// keeps the clues and remembers which ones are collected

public class ClueManager {

    String[] clues = {
        "The office door was opened at 2:15 PM.",
        "CCTV shows someone entering the office.",
        "A torn piece of paper was found near the printer.",
        "A suspect's ID card was found inside the office.",
        "The printer was used shortly before the question paper disappeared."
    };

    // false = not collected yet
    boolean[] collected = new boolean[clues.length];
    int count = 0;

    void displayAvailableClues() {
        System.out.println("\nAvailable clues:");
        for (int i = 0; i < clues.length; i++) {
            if (!collected[i]) {
                System.out.println("  Clue " + (i + 1) + ": " + clues[i]);
            }
        }
    }

    // clueNo starts from 1
    void collectClue(int clueNo) {
        if (clueNo < 1 || clueNo > clues.length) {
            System.out.println("Clue " + clueNo + " does not exist.");
            return;
        }
        if (collected[clueNo - 1]) {
            System.out.println("Clue " + clueNo + " is already collected.");
            return;
        }
        collected[clueNo - 1] = true;
        count++;
        System.out.println("Collected clue " + clueNo + ": " + clues[clueNo - 1]);
    }

    void displayCollectedClues() {
        System.out.println("\n----- COLLECTED CLUES -----");
        if (count == 0) {
            System.out.println("No clues collected yet.");
            return;
        }
        for (int i = 0; i < clues.length; i++) {
            if (!collected[i]) {
                continue;   // skip the ones we don't have
            }
            System.out.println("  " + (i + 1) + ". " + clues[i]);
        }
        System.out.println("Total clues collected: " + count + "/" + clues.length);
    }
}
