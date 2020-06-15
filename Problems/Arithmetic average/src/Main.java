import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int quantity = 0;

        for (int i = a; i <= b; i++) {
            if (i != 0 && i % 3 == 0) {
                sum += i;
                quantity++;
            }
        }

        double doubleSum = sum;
        double average = sum / (double) quantity;

        System.out.println(average);
        // put your code here
    }
}