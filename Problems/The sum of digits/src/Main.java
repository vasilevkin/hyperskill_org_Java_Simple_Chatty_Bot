import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sumOfDigits = (number / 100) + (number / 10 % 10) + (number % 10);

        System.out.println(sumOfDigits);
        // put your code here
    }
}