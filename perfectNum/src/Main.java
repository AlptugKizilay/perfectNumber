import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Enter the number: ");
            number = inp.nextInt();
            int tempNumber = number, result = 0;

            for (int i = 1; i < number; i++) {
                if (tempNumber % i == 0) {
                    result = result + i;
                }
            }
            if (number == result) {
                System.out.println(number + " is Perfect Number.");
            } else {
                System.out.println(number + " is not Perfect Number.");
            }
        }

    }
}