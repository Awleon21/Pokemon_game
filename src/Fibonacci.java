import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    //The Fibonacci Sequence is the series of numbers:
    //
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    //
    //The next number is found by adding up the two numbers before it

    // Write a program that takes in a number and goes up to that number in the fibonacci sequence
    // First do it iteratively
    // Challenge:   Do it recursively
    private static Map<Long, Long> memory = new HashMap<>();

    public static void main(String args[]) {

        //input to print Fibonacci series up to how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        // YOU MAY CHANGE THIS TO HANDLE ALL OF PRINTING IN THE METHOD IF YOU WISH
        fibonacci2(number);
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * Use iteration to solve this problem
     * @return Fibonacci number
     */
    // YOU MAY CHANGE THIS TO HANDLE ALL OF PRINTING IN THE METHOD IF YOU WISH
    public static int fibonacci2(int number){
        // enter code here

        int fn = 0;
        int fn1 = 1;
        int fn2 = 0;

        for(int i=1; i<=number; i++){
            fn2 = fn1 + fn;
            fn = fn1;
            fn1 = fn;
            System.out.print(fn1 +" ");
        }

        return fn1;

    }
    public static long fibonacci3(long number) {
        if (number == 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        } else if (memory.containsKey(number)) {
            return memory.get(number);
        } else {
            Long result = fibonacci3(number - 1) + fibonacci3(number - 2);
            memory.put(number, result);
            return result;
        }
    }


    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number
     * for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number){
        // enter code here
        if (number <= 1)
            return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
