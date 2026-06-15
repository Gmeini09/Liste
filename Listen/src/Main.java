import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedStringList myList = new LinkedStringList();

        System.out.println("=== Verkettete Liste in Java ===");
        System.out.println("Gib Strings ein. Mit X beendest du die Eingabe.");

        readInitialValues(myList);
        showMenu(myList);

        scanner.close();
    }

    private static void readInitialValues(LinkedStringList myList) {
        while (true) {
            System.out.print("Wert eingeben (X = fertig): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("X")) {
                break;
            }

            myList.add(input);
            System.out.println("Hinzugefuegt: " + input);
        }
    }

    private static void showMenu(LinkedStringList myList) {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("--- Menue ---");
            System.out.println("1  Liste anzeigen");
            System.out.println("2  Aktuelles Element anzeigen");
            System.out.println("3  Next - Cursor nach rechts bewegen");
            System.out.println("4  Prev - Cursor nach links bewegen");
            System.out.println("5  Liste sortieren");
            System.out.println("6  Aktuelles Element loeschen");
            System.out.println("7  Neuen Wert am Ende hinzufuegen");
            System.out.println("8  Cursor auf Anfang setzen");
            System.out.println("9  Cursor auf Ende setzen");
            System.out.println("0  Beenden");
            System.out.print("Auswahl: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> System.out.println(myList.toDetailedString());
                case "2" -> showCurrent(myList);
                case "3" -> moveNext(myList);
                case "4" -> movePrev(myList);
                case "5" -> sortList(myList);
                case "6" -> deleteCurrent(myList);
                case "7" -> addValue(myList);
                case "8" -> moveToHead(myList);
                case "9" -> moveToTail(myList);
                case "0" -> running = false;
                default -> System.out.println("Ungueltige Eingabe.");
            }
        }

        System.out.println("Programm beendet.");
    }

    private static void showCurrent(LinkedStringList myList) {
        String value = myList.current();

        if (value == null) {
            System.out.println("Die Liste ist leer. Es gibt kein aktuelles Element.");
        } else {
            System.out.println("Cursor steht auf: " + value);
        }
    }

    private static void moveNext(LinkedStringList myList) {
        if (myList.next()) {
            System.out.println("Cursor wurde nach rechts bewegt. Aktuell: " + myList.current());
        } else {
            System.out.println("Next nicht moeglich. Der Cursor ist bereits am Ende oder die Liste ist leer.");
        }
    }

    private static void movePrev(LinkedStringList myList) {
        if (myList.prev()) {
            System.out.println("Cursor wurde nach links bewegt. Aktuell: " + myList.current());
        } else {
            System.out.println("Prev nicht moeglich. Der Cursor ist bereits am Anfang oder die Liste ist leer.");
        }
    }

    private static void sortList(LinkedStringList myList) {
        myList.sort();
        System.out.println("Liste wurde alphabetisch sortiert.");
        System.out.println(myList.toDetailedString());
    }

    private static void deleteCurrent(LinkedStringList myList) {
        String deletedValue = myList.current();

        if (myList.deleteCurrent()) {
            System.out.println("Geloescht: " + deletedValue);
            System.out.println(myList.toDetailedString());
        } else {
            System.out.println("Loeschen nicht moeglich. Die Liste ist leer.");
        }
    }

    private static void addValue(LinkedStringList myList) {
        System.out.print("Neuer Wert: ");
        String value = scanner.nextLine();

        if (value.equalsIgnoreCase("X")) {
            System.out.println("X wird als Abbruchzeichen verwendet und nicht eingefuegt.");
            return;
        }

        myList.add(value);
        System.out.println("Hinzugefuegt: " + value);
    }

    private static void moveToHead(LinkedStringList myList) {
        if (myList.moveToHead()) {
            System.out.println("Cursor steht jetzt am Anfang: " + myList.current());
        } else {
            System.out.println("Die Liste ist leer.");
        }
    }

    private static void moveToTail(LinkedStringList myList) {
        if (myList.moveToTail()) {
            System.out.println("Cursor steht jetzt am Ende: " + myList.current());
        } else {
            System.out.println("Die Liste ist leer.");
        }
    }
}
