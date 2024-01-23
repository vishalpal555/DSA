public class LinkedList {
    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
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
        }
        else if(this.length > 0){
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.length++;
    }

    public void printAll(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
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
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            this.length--;
            this.tail = pre;
            this.tail.next = null;
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
            newNode.next = head;
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
            temp.next = null;
            this.length -- ;
            return temp;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
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
            temp = temp.next;
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
                temp.value = value;
                return true;
            }
            temp = temp.next;
            i++;
        }
        return false;
    }

    public boolean insert(int index, int value){
        boolean flag;
        if(index < 0 || index > length){
            flag = false;
        }
        else if(index == 0){
            this.prepend(value);
            flag = true;
        }
        else if(index == length){
            this.append(value);
            flag = true;
        }
        else{
            Node newNode = new Node(value);
            Node prevNode = this.get(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            flag = true;
        }
        this.length++;
        return flag;
    }

    public Node remove(int index){
        Node temp;
        if(index < 0 || index >= this.length){
            temp = null;
        }
        else if(index == 0){
            temp = this.removeFirst();
        }
        else if(index == this.length-1){
            temp = this.removeLast();
        }
        else{
            Node prevNode = this.get(index-1);
            temp = prevNode.next;
            prevNode.next = temp.next;
        }
        temp.next = null;
        this.length--;
        return temp;
    }

    public void reverse(){
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        Node after = null;
        Node prev = null;
        for(int i = 0; i < this.length; i++){
            after = temp.next;
            temp.next = prev;
            prev = temp;
            temp = after;
        }
    }

    public void printInfo(){
        Node temp = this.head;
        while(temp != null){
            System.out.println("This address : " +temp +" | Value : " +temp.value +" | Next Address : " +temp.next);
            temp = temp.next;
        }
    }
}
