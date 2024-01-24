package DSA;

public class MergeSort {
    public static void sort(int[] inputArray){
        if(inputArray.length < 2) return;

        int inputArraySize = inputArray.length;
        int mid = inputArraySize/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputArraySize - mid];

        System.arraycopy(inputArray, 0, leftArray, 0, mid);
        System.arraycopy(inputArray, mid, rightArray, 0, inputArraySize - mid);

        sort(leftArray);
        sort(rightArray);

        merge(inputArray, leftArray, rightArray);
    }
    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }
        while(i < leftArray.length){
            inputArray[k++] = leftArray[i++];
        }
        while(j < rightArray.length){
            inputArray[k++] = rightArray[j++];
        }
    }
    public static void printArray(int[] array){
        System.out.print("{");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i < array.length-1){
                System.out.print(", ");
            } else {
                System.out.println("}");
            }
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{3,6,2,9,1,2,7,8,3};
        System.out.print("Before sorting : ");
        printArray(array);
        sort(array);
        System.out.print("After sorting : ");
        printArray(array);
    }
}
