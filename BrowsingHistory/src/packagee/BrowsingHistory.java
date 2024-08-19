package packagee;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
    private Deque<String> history;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
            forwardStack.clear();
        }
        currentPage = url;
        System.out.println("Visited: " + url);
    }

    public void goBack() {
        if (history.isEmpty()) {
            System.out.println("No pages in history.");
        } else {
            forwardStack.push(currentPage);
            currentPage = history.pop();
            System.out.println("Went back to: " + currentPage);
        }
    }

    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward pages.");
        } else {
            history.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        }
    }

    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page currently being viewed.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowsingHistory browsingHistory = new BrowsingHistory();
        boolean running = true;

        while (running) {
            System.out.println("\nBrowsing History");
            System.out.println("1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    browsingHistory.visitPage(url);
                    break;
                case 2:
                    browsingHistory.goBack();
                    break;
                case 3:
                    browsingHistory.goForward();
                    break;
                case 4:
                    browsingHistory.displayCurrentPage();
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
