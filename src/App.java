import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Call the eliminateDuplicates method
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        
        HashSet<Integer> set = new HashSet<>();
        
        
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }

        
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }

        return result;
    }
}
