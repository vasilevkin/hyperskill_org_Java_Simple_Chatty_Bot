import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        for (int i = 1; i <= 4; i++) {
//            int number = scanner.nextInt();
//
//            System.out.print(--number + " ");
//        }

        String shortString = "str";
        long number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        String result2 = number + 50 + shortString; // what is the result2?

        System.out.println(result1);
        System.out.println(result2);
        // put your code here
    }
}