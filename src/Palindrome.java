import java.util.Scanner;

public class Palindrome {

    // Write a program to determine if a given string is a palindrome
    // PALINDROME = if a word is spelled the same way forward as backwards
    // if this is too easy -->
    //        Challenge: Write the program so it takes an input from the terminal and tells whether it is a palindrome
    //        Challenge 2: Have the program continue to run and ask for more palindromes until you type 'exit'

    // Driver code
    public static void main(String[] args) {
        // enter code here
        //kayak, racecar, tacocat
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a word");
            String response = scan.nextLine();

            if(response.toLowerCase().equals("exit")){
                break;
            }

            if(isPalindrome(response)){
                System.out.println("This is a palindrome");
            }
            else{
                System.out.println("This is not a palindrome");
            }


        }

    }




    // Function that returns true if
    // str is a palindrome
    static boolean isPalindrome(String str) {
        // enter code here
        String reversed = "";
        StringBuilder stb = new StringBuilder();
        stb.append(str);
        reversed = String.valueOf(stb.reverse());
        System.out.println(reversed);

        return (str.equals(reversed));

    }
}
