import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 0;
        long factorialN = 0;

        while (factorialN <= m) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            factorialN = fact;
            n++;
        }

        System.out.print(n - 1);
        // put your code here
    }
}
