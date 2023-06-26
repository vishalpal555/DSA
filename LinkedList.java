public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else if(this.length > 0){
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }

    public void printAll(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public Node removeLast(){
        if(this.length == 0){
            return null;
        }
        else if(this.length == 1){
            Node temp = this.head;
            this.head = null;
            this.tail = null;
            this.length--;
            return temp;
        }
        else{
            Node pre = head;
            Node temp = head;
            while(temp.getNext() != null){
                pre = temp;
                temp = temp.getNext();
            }
            this.length--;
            this.tail = pre;
            this.tail.setNext(null);
            return temp;
        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.setNext(head);
            head = newNode;
        }
        this.length++;
    }

    public Node removeFirst(){
        if(this.length == 0){
            return null;
        }
        else if(this.length == 1){
            Node temp = this.head;
            this.head = null;
            this.tail = null;
            temp.setNext(null);
            this.length -- ;
            return temp;
        }
        else{
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            this.length--;
            return temp;
        }
    }

    public Node get(int index){
        if(index < 0 || index > length){
            return null;
        }
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(i == index){
                return temp;
            }
            temp = temp.getNext();
            i++;
        }
        return null;
    }

    public boolean set(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(i == index){
                temp.setValue(value);
                return true;
            }
            temp = temp.getNext();
            i++;
        }
        return false;
    }

    public void printInfo(){
        Node temp = this.head;
        while(temp != null){
            System.out.println("This address : " +temp +" | Value : " +temp.getValue() +" | Next Address : " +temp.getNext());
            temp = temp.getNext();
        }
    }
}
