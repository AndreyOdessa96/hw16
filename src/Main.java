import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.println(findSymbolOccurance(str, symbol));


        System.out.print("Enter the source string: ");
        String source = scanner.next();
        System.out.print("Enter the target string: ");
        String target = scanner.next();
        System.out.println(findWordPosition(source, target));


        System.out.print("Enter a string to reverse: ");
        String stringToReverse = scanner.next();
        System.out.println(stringReverse(stringToReverse));


        System.out.print("Enter a string to check if it's a palindrome: ");
        String stringToCheck = scanner.next();
        System.out.println(isPalindrome(stringToCheck));

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);
    }

    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(stringReverse(str));
    }

    public static void guessWord(String[] words) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String word = words[rand.nextInt(words.length)];
        while (true) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();
            if (guess.equals(word)) {
                System.out.println("You won!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < word.length() && i < guess.length() && word.charAt(i) == guess.charAt(i)) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
}