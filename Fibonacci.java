package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class Fibonacci {
    long[] cache;   // array cache
    HashMap<Integer, Long> cacheMap;    // hashmap cache
    public Fibonacci(){
        cacheMap = new HashMap<>();
        cacheMap.put(0, 0L);
        cacheMap.put(1, 1L);
    }
    public long fibonacci(int n){
        if(n == 0) {
            return 0;
        }
        if(n <= 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public long dynamicFibonacciArr(int n){
        cache = new long[n+1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        return dynamicRecurFibonacci(n);
    }
    private long dynamicRecurFibonacci(int n){
        if(cache[n] != -1){
            return cache[n];
        }
        cache[n] = dynamicRecurFibonacci(n-1) + dynamicRecurFibonacci(n-2);
        return cache[n];
    }
    public long dynamicFibonacciMap(int n){
        if(cacheMap.containsKey(n)){
            return cacheMap.get(n);
        }
        long value = dynamicFibonacciMap(n-1) + dynamicFibonacciMap(n-2);
        cacheMap.put(n, value);
        return value;
    }
    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        int n = 45;

        System.out.println("normal fibonacci: ");
        long data = Timer.timeTaken(() -> fibonacci.fibonacci(n));
        System.out.println(data);

        System.out.println("dynamic fibonacci with array cache: ");
        long dataDynamicArr = Timer.timeTaken(() -> fibonacci.dynamicFibonacciArr(n));
        System.out.println(dataDynamicArr);

        System.out.println("dynamic fibonacci with map cache: ");
        long dataDynamicMap = Timer.timeTaken(() -> fibonacci.dynamicFibonacciMap(n));
        System.out.println(dataDynamicMap);

    }
}
