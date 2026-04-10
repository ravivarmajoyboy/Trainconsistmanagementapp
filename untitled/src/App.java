import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== Train Chaining Management (UC4 - LinkedList) ===");

        // Adding initial bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Consist: " + trainConsist);

        // Requirement: Insert Pantry Car at position 2 (Index 2)
        System.out.print("Adding Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nUpdated Consist: " + trainConsist);

        // Requirement: Remove first and last bogie
        System.out.println("Detaching First Bogie: " + trainConsist.removeFirst());
        System.out.println("Detaching Last Bogie: " + trainConsist.removeLast());

        // Display final ordered consist
        System.out.println("\n--- Final Ordered Train Consist ---");
        System.out.println(trainConsist);
        System.out.println("Total Bogie Count: " + trainConsist.size());

        // User Input to keep program active
        System.out.println("\nProgram continues. Press Enter to exit.");
        scanner.nextLine();

        scanner.close();
    }
}