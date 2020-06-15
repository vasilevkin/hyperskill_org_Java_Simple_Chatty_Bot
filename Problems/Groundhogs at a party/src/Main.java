import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeedend = scanner.nextBoolean();

        boolean success = cups >= 10 && cups <= 20 && !isWeedend ||
                cups >= 15 && cups <= 25 && isWeedend;

        System.out.println(success);
        // put your code here
    }
}