package DSA;

import java.util.function.Supplier;

class Timer{
    public static <T> T timeTaken(Supplier<T> supplier){
        long startTimer = System.nanoTime();
        T returnData = supplier.get();
        long endTimer = System.nanoTime();
        System.out.println("Time taken : " +(endTimer - startTimer) + " ns");
        System.out.println("Time taken : " +(endTimer - startTimer) / 1_000_000 + " ms");
        System.out.println("Time taken : " +(endTimer - startTimer) / 1_000_000_000+ " s");
        return returnData;
    }
}