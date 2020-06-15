import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int maxElementDivBy4 = 0;
        int i = 1;

        while (i <= elements) {
            int number = scanner.nextInt();

            if ((number % 4 == 0) && (number > maxElementDivBy4)) {
                maxElementDivBy4 = number;
            }
            i++;
        }

        System.out.println(maxElementDivBy4);
        // put your code here
    }
}
