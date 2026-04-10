import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Bogie ID Tracker (UC3 - HashSet) ===");

        System.out.print("Enter number of Bogie IDs to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = scanner.nextLine();

            boolean added = bogieIds.add(id);
            if (!added) {
                System.out.println("Duplicate detected! ID " + id + " was ignored.");
            }
        }

        System.out.println("\n--- Unique Bogie ID Inventory ---");
        System.out.println("Unique IDs: " + bogieIds);
        System.out.println("Total Unique Count: " + bogieIds.size());

        System.out.println("\nProgram continues.");
        scanner.close();
    }
}