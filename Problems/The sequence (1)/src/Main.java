import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int repeat = 0;

        for (int i = 1; i <= number + 1; i++) {
            if (repeat == number) break;

            for (int j = 1; j <= i; j++) {
                if (repeat == number) break;

                repeat++;

                System.out.print(i + " ");

                if (i == j) {
                    break;
                }
            }
        }
    }
}
