import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer previousNumber = null;
        boolean isSequence = false;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println(isSequence);
                break;
            }
            if (previousNumber == null) {
                previousNumber = number;
                continue;
            }
            if ((previousNumber + 1 == number) ||
                    (previousNumber - 1 == number) ||
                    (previousNumber == number)) {
                    isSequence = true;

            } else {
                isSequence = false;
            }
            previousNumber = number;

        }
        // put your code here
    }
}