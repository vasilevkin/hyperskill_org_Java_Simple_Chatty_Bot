import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxNumberDivBy4 = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0) {
                if (number > maxNumberDivBy4) {
                    maxNumberDivBy4 = number;
                }
            }
        }

        System.out.println(maxNumberDivBy4);
        // put your code here
    }
}
