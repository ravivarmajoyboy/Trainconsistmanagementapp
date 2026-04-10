import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Formation Management (UC5 - LinkedHashSet) ===");

        // Attaching bogies in specific order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempting to add a duplicate bogie
        System.out.println("Attempting to add duplicate: Sleeper...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Constraint Violated: Sleeper is already attached. Duplicate ignored.");
        }

        // Displaying the final formation
        System.out.println("\n--- Final Train Formation (Insertion Order Preserved) ---");
        System.out.println(trainFormation);

        // Capture user input to maintain the session
        System.out.print("\nEnter a new bogie type to attach: ");
        String newBogie = scanner.nextLine();

        if (trainFormation.add(newBogie)) {
            System.out.println(newBogie + " attached successfully.");
        } else {
            System.out.println(newBogie + " already exists in the formation.");
        }

        System.out.println("Updated Formation: " + trainFormation);
        System.out.println("\nProgram continues.");

        scanner.close();
    }
}