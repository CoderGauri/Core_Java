// Main.java
import java.util.Scanner;
import java.util.List;

public class Main {
    private static final String SAVE_FILE = "tasks.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        // Optional: load from file
        try {
            manager.loadFromFile(SAVE_FILE);
        } catch (Exception e) {
            // ignore errors for simplicity
        }

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Title: ");
                    String title = scanner.nextLine().trim();
                    System.out.print("Description (optional): ");
                    String desc = scanner.nextLine().trim();
                    manager.addTask(title, desc);
                    System.out.println("Added.\n");
                    break;
                case "2":
                    list(manager);
                    break;
                case "3":
                    System.out.print("Enter task ID to toggle done/undone: ");
                    int id3 = readInt(scanner);
                    if (id3 >= 0) {
                        var t3 = manager.findById(id3);
                        if (t3 != null) {
                            t3.setDone(!t3.isDone());
                            System.out.println("Toggled.\n");
                        } else System.out.println("Task not found.\n");
                    }
                    break;
                case "4":
                    System.out.print("Enter task ID to delete: ");
                    int id4 = readInt(scanner);
                    if (id4 >= 0) {
                        boolean removed = manager.removeById(id4);
                        System.out.println(removed ? "Deleted.\n" : "Task not found.\n");
                    }
                    break;
                case "5":
                    // Save
                    try {
                        manager.saveToFile(SAVE_FILE);
                        System.out.println("Saved to file.\n");
                    } catch (Exception e) {
                        System.out.println("Failed to save: " + e.getMessage() + "\n");
                    }
                    break;
                case "0":
                    // Before exit, ask to save
                    System.out.print("Save before exit? (y/n): ");
                    String s = scanner.nextLine().trim().toLowerCase();
                    if (s.startsWith("y")) {
                        try {
                            manager.saveToFile(SAVE_FILE);
                            System.out.println("Saved. Bye!");
                        } catch (Exception e) {
                            System.out.println("Failed to save: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Bye!");
                    }
                    running = false;
                    break;
                default:
                    System.out.println("Unknown choice. Try again.\n");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== ToDo List Manager ===");
        System.out.println("1. Add task");
        System.out.println("2. List tasks");
        System.out.println("3. Toggle done/undone");
        System.out.println("4. Delete task");
        System.out.println("5. Save tasks to file");
        System.out.println("0. Exit");
    }

    private static void list(TaskManager manager) {
        List<Task> list = manager.listTasks();
        if (list.isEmpty()) {
            System.out.println("No tasks yet.\n");
            return;
        }
        System.out.println("Your tasks:");
        for (Task t : list) {
            System.out.println(t.toString());
        }
        System.out.println();
    }

    private static int readInt(Scanner scanner) {
        String s = scanner.nextLine().trim();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.\n");
            return -1;
        }
    }
}
