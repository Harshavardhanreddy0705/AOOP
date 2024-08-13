package simple_to_do_lost_project2;

import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (add, remove, complete, list, exit):");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;

                case "remove":
                    System.out.println("Enter task index to remove:");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoList.removeTask(removeIndex);
                    break;

                case "complete":
                    System.out.println("Enter task index to mark as completed:");
                    int completeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoList.markTaskAsCompleted(completeIndex);
                    break;

                case "list":
                    List<Task> tasks = toDoList.getTasks();
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
