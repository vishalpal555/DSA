public class ArrayStack {
    private int top;
    private int[] data;
    public ArrayStack(int size){
        data = new int[size];
        this.top = -1;
    }
    public boolean isFull(){
        return (this.top == this.data.length - 1);
    }
    public boolean isEmpty(){
        return (this.top == -1);
    }
    public boolean push(int value){
        if(!this.isFull()){
            this.data[++this.top] = value;
            return true;
        }
        return false;
    }
    public int pop(){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int data = this.data[this.top];
        this.data[this.top--] = 0;
        return data;
    }
    public static void main(String[] args) {
        try {
            ArrayStack arrayStack = new ArrayStack(10);
            System.out.println(arrayStack.push(10));
            System.out.println(arrayStack.pop());
            System.out.println(arrayStack.pop());
        } catch (IndexOutOfBoundsException indexException){
            System.out.println(indexException);
        }
    }
}
