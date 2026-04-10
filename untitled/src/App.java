import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bogieCapacities = new HashMap<>();

        System.out.println("=== Train Bogie Capacity Management (UC6 - HashMap) ===");

        // Requirement: Mapping bogies to their seating/load capacities
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // Displaying capacity details using entrySet() iteration
        System.out.println("\n--- Bogie Capacity Details ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // Simulating user lookup (Fast Lookup Benefit)
        System.out.print("\nEnter a bogie name to check capacity: ");
        String searchKey = scanner.nextLine();

        if (bogieCapacities.containsKey(searchKey)) {
            System.out.println("The capacity of " + searchKey + " is " + bogieCapacities.get(searchKey) + ".");
        } else {
            System.out.println("Bogie type not found in database.");
        }

        System.out.println("\nProgram continues.");
        scanner.close();
    }
}