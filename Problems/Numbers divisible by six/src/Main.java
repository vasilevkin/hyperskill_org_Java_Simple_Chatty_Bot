import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < quantity; i++) {
            int number = scanner.nextInt();

            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
        // put your code here
    }
}