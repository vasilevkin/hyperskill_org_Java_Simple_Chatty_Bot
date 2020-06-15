import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;

        if (number > 0) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);
        // put your code here
    }
}