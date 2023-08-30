package in.Examnation;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static String renovateHouses(String houses) {
        StringBuilder answer = new StringBuilder();

        // Write your code here
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int i = 0; i < houses.length(); i++) {
            char currentChar = houses.charAt(i);
            if (!vowels.contains(currentChar)) {
                answer.append(currentChar);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        // Input for houses
        Scanner scanner = new Scanner(System.in);
        String houses = scanner.nextLine();
        String result = renovateHouses(houses);
        System.out.println(result);
    }
}