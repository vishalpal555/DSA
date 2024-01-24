package DSA;

import java.util.function.Supplier;

class Timer{
    public static <T> T timeTaken(Supplier<T> supplier){
        long startTimer = System.currentTimeMillis();
        T returnData = supplier.get();
        System.out.println("Time taken : " +(System.currentTimeMillis() - startTimer) + " ms");
        return returnData;
    }
}