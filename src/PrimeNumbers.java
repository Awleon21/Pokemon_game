import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumbers {

    // Write a program to tell whether a number is a prime number or not
    // print if the number typed in is a Prime or Not Prime
    // Make the program continuously run until the number 0 is typed in
    //      Challenge: Think of another way to solve this problem other than your first solution
    //      Challenge 2: enhance either one of the solutions above to either simplify or speed it up
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("insert a number");
        int response = Integer.valueOf(scnr.nextLine());
        System.out.println(isPrimeOrNot(response));

//        while(true){
//
//            System.out.println("input a number");
//            int response = Integer.valueOf(scnr.nextLine());
//
//            if(isPrime(response)){
//                System.out.println(response + " is a prime number");
//            }
//            else {
//                System.out.println(response + " is not a prime number");
//            }
//        }



    }


    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    public static boolean isPrime(int number) {

        if(number <= 1){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(i % number == 0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }


    /*
     * Second version of isPrimeNumber method, with improvements
     * @return true if number is prime, else false
     */
    public static boolean isPrimeNumber(int number) {

        return true;

    }


    /*
     * Third way to check if a number is prime or not.
     */
    public static String isPrimeOrNot(int num) {

        int[] primes = {2,3,5,7};
        String result = "";

        for(int digit : primes){
            if(num % digit == 0){
                result = "number is not prime";
                break;
            }
            else
            {
                result = "number is prime";
            }
        }
        return result;
    }

    public boolean isPrime3(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

}
