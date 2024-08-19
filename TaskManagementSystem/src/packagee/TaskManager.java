package packagee;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDescription(newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean running = true;

        while (running) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updateIndex - 1, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex - 1);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
