import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RunSinglyLinkedList runSinglyLinkedList = new RunSinglyLinkedList();
        RunDoublyLinkedList runDoublyLinkedList = new RunDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                                Enter an option
                                a. for Single Linked List.
                                b. for Double Linked List. \n
                                                    """);
        char option = sc.next().toLowerCase().charAt(0);

        switch (option){
            case 'a':
                    runSinglyLinkedList.run();
                    break;
            case 'b':
                    runDoublyLinkedList.run();
                    break;
            default:
                    System.out.println("Wrong input");
                    break;
        }
    }
}
