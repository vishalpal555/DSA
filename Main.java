import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(0);
        for(int i=1; i<10; i++){
            list.append(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """
                            case "1": printInfo();
                            case "2": printAll();
                            case "3": append(sc.nextInt());
                            case "4": removeLast();
                            case "5": prepend(sc.nextInt());
                            case "6": removeFirst();
                            case "7": get(int index);
                        """
        );
        System.out.print("Enter an option: ");
        String inp = sc.next();
        while(!inp.equalsIgnoreCase("n")){
            switch (inp) {
                case "1":
                    list.printInfo();
                    break;
                case "2":
                    list.printAll();
                    break;
                case "3":
                    System.out.print("Enter a int value: ");
                    list.append(sc.nextInt());
                    break;
                case "4":
                    System.out.println("Removed " +list.removeLast());
                    list.printAll();
                    break;
                case "5":
                    System.out.print("Enter a int value: ");
                    list.prepend(sc.nextInt());
                    break;
                case "6":
                    System.out.println("Removed " +list.removeFirst());
                    list.printAll();
                    break;
                case "7":
                    System.out.println("Enter the index: ");
                    System.out.println(list.get(sc.nextInt()));
                default:
                    System.out.println("None selected");
                    break;
            }

            System.out.print("Enter an option: ");
            inp = sc.next();
        }
    }
}
