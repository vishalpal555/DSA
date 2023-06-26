public class TrialDSA {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setNext(node2);
        Node node3 = node1;

        node3.setNext(null);
        System.out.println(node1);
    }
}