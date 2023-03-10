import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = input.nextInt();

        int digitSum = 0;

        while (number != 0) {
            digitSum += number % 10;
            number /= 10;
        }

        System.out.println("Digit sum: " + digitSum);
    }
}
