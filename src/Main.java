import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("Enter 'A' to add a task, 'C' to mark a task as complete, 'V' to view the list, 'R' to remove completed tasks, or 'Q' to quit:");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("Q")) {
                System.out.println("Exiting the application...");
                break;
            }

            switch (input) {
                case "A":
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    toDoList.addTask(task);
                    break;

                case "C":
                    System.out.println("Enter the index of the task to mark as complete:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    toDoList.markTaskComplete(index - 1);
                    break;

                case "V":
                    toDoList.viewTasks();
                    break;

                case "R":
                    toDoList.removeCompletedTasks();
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }
}