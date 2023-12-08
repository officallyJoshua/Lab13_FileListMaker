import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab13_FileListMaker {
    private static ArrayList<String> itemList = new ArrayList<>();
    private static boolean needsToBeSaved = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case 'A':
                    addItem(scanner);
                    break;
                case 'D':
                    deleteItem(scanner);
                    break;
                case 'V':
                    viewList();
                    break;
                case 'O':
                    openList(scanner);
                    break;
                case 'S':
                    saveList();
                    break;
                case 'C':
                    clearList();
                    break;
                case 'Q':
                    quitProgram(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 'Q');
    }

    private static void displayMenu() {
        System.out.println("Options:");
        System.out.println("A – Add an item to the list");
        System.out.println("D – Delete an item from the list");
        System.out.println("V - View the list");
        System.out.println("O – Open a list file from disk");
        System.out.println("S – Save the current list file to disk");
        System.out.println("C – Clear removes all the elements from the current list");
        System.out.println("Q – Quit the program");
    }

    private static void addItem(Scanner scanner) {
    }

    private static void deleteItem(Scanner scanner) {
    }

    private static void viewList() {
    }

    private static void openList(Scanner scanner) {
    }

    private static void saveList() {
    }

    private static void clearList() {
    }

    private static void quitProgram(Scanner scanner) {
    }
}