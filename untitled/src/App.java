import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("Bogie: %-12s | Capacity: %d seats", name, capacity);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bogie> trainConsist = new ArrayList<>();

        System.out.println("=== Train Capacity Sorting (UC7 - Comparator) ===");

        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("General", 90));

        System.out.println("\n--- Unsorted Bogies ---");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        trainConsist.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n--- Bogies Sorted by Capacity (Ascending) ---");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues.");
        System.out.print("Press Enter to finish...");
        scanner.nextLine();

        scanner.close();
    }
}