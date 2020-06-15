import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 37;

        // n4 n3 n2 n1
        int n1 = number % 10;
        int n2 = number % 100 / 10;
        int n3 = number / 100 % 10;
        int n4 = number / 1000 % 10;

        if ((n1 == n4) && (n2 == n3)) {
            result = 1;
        }

        System.out.println(result);
        // put your code here
    }
}