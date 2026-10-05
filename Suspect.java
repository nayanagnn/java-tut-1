// Student 1 - Suspect Management
// stores details of each suspect and shows them

public class Suspect {

    int id;
    String name;
    String location;
    String alibi;

    // constructor
    Suspect(int id, String name, String location, String alibi) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }

    // shows one suspect
    void display() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Location : " + location);
        System.out.println("Alibi    : " + alibi);
        System.out.println("---------------------------------");
    }

    // creates the 5 suspects and returns them as an array
    static Suspect[] createSuspects() {
        Suspect[] list = new Suspect[5];
        list[0] = new Suspect(1, "Alex", "Computer Lab", "Working on a project");
        list[1] = new Suspect(2, "Maya", "Library", "Studying");
        list[2] = new Suspect(3, "Rahul", "Staff Room", "Meeting a faculty member");
        list[3] = new Suspect(4, "Sara", "Canteen", "Having lunch");
        list[4] = new Suspect(5, "Arjun", "Department Office", "Collecting documents");
        return list;
    }

    // shows all suspects
    static void displayAll(Suspect[] list) {
        System.out.println("\n----- LIST OF SUSPECTS -----");
        for (Suspect s : list) {
            s.display();
        }
    }
}
