public class DoublyLinkedList {
    class Node {
        int value;
        Node prevNode;
        Node nextNode;
        public Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
        } else if(this.length > 0){
            this.tail.nextNode = newNode;
            newNode.prevNode = this.tail;
        }
        this.tail = newNode;
        this.length++;
    }

    public void printInfo(){
        Node temp = this.head;
        System.out.println("Length = " +this.length);
        while (temp != null){
            System.out.println("This address : " +temp +" | Value : " +temp.value +" | Prev Address : " +temp.prevNode +" | Next Address : " +temp.nextNode);
            temp = temp.nextNode;
        }
    }
}
