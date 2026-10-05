// Student 3 - Investigation and Accusation

public class Investigation {

    Suspect[] suspects;
    int culpritId = 3;          // Rahul - kept hidden from the detective
    int attempts = 0;
    final int MAX_ATTEMPTS = 3;
    boolean caseSolved = false;

    Investigation(Suspect[] suspects) {
        this.suspects = suspects;
    }

    // returns the suspect with that id, or null if not found
    Suspect findSuspect(int id) {
        for (int i = 0; i < suspects.length; i++) {
            if (suspects[i].id == id) {
                return suspects[i];
            }
        }
        return null;
    }

    void investigate(int id) {
        System.out.println("\nInvestigating suspect with ID " + id + "...");
        Suspect s = findSuspect(id);
        if (s == null) {
            System.out.println("No suspect found with ID " + id);
        } else {
            s.display();
        }
    }

    void accuse(int id) {
        if (caseSolved) {
            System.out.println("Case is already solved.");
            return;
        }
        if (attempts >= MAX_ATTEMPTS) {
            System.out.println("No attempts left.");
            return;
        }

        Suspect s = findSuspect(id);
        if (s == null) {
            System.out.println("Invalid suspect ID, attempt not counted.");
            return;
        }

        attempts++;
        System.out.println("\nYou accuse " + s.name + "... (attempt " + attempts + " of " + MAX_ATTEMPTS + ")");

        if (s.id == culpritId) {
            caseSolved = true;
            System.out.println("\nCASE SOLVED!");
            System.out.println("You identified the culprit.");
            System.out.println("The missing question paper has been recovered.");
        } else if (attempts == MAX_ATTEMPTS) {
            System.out.println("\nINVESTIGATION FAILED!");
            System.out.println("You have used all three attempts.");
            System.out.println("The culprit escaped.");
        } else {
            System.out.println("Wrong person! " + s.name + " is innocent.");
            System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
        }
    }

    // investigation ends if solved or all attempts used
    boolean isOver() {
        return caseSolved || attempts >= MAX_ATTEMPTS;
    }
}
