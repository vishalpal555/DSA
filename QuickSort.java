import java.util.Random;

public class QuickSort {

    public void quickSort(int[] array, int lower, int higher){

    }
    public static void main(String[] args) {
        int size = 20;
        Random random = new Random();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = random.nextInt(1000);
        }

        for (int val:arr ) {
            System.out.println(val);
        }
    }
}
