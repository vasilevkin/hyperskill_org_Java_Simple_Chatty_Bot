import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStatus;

        do {
            int number = scanner.nextInt();

            if (number == 0) break;
            if (number % 2 == 0) numberStatus = "even";
            else numberStatus = "odd";

            System.out.println(numberStatus);
        } while (true);
        // put your code here
    }
}
