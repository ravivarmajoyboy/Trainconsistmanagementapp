import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> trainConsist = new ArrayList<>();

        System.out.println("=== Train Consist Management App (UC2) ===");

        trainAddress:
        while (true) {
            System.out.println("\n1. Add Bogie\n2. Remove Bogie\n3. Check Bogie\n4. View Consist\n5. Exit");
            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Bogie Type (e.g., Sleeper, AC Chair): ");
                    trainConsist.add(scanner.nextLine());
                    break;
                case "2":
                    System.out.print("Enter Bogie to remove: ");
                    String toRemove = scanner.nextLine();
                    if (trainConsist.remove(toRemove)) {
                        System.out.println(toRemove + " removed.");
                    } else {
                        System.out.println("Bogie not found.");
                    }
                    break;
                case "3":
                    System.out.print("Search for Bogie: ");
                    String toFind = scanner.nextLine();
                    if (trainConsist.contains(toFind)) {
                        System.out.println(toFind + " exists in the train.");
                    } else {
                        System.out.println(toFind + " does not exist.");
                    }
                    break;
                case "4":
                    System.out.println("Current Consist: " + trainConsist);
                    System.out.println("Total Count: " + trainConsist.size());
                    break;
                case "5":
                    break trainAddress;
                default:
                    System.out.println("Invalid option.");
            }
        }

        System.out.println("Final Bogie Count: " + trainConsist.size());
        System.out.println("Program continues.");
        scanner.close();
    }
}