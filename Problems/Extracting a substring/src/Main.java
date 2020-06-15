import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        System.out.println(line.substring(rangeStart, rangeEnd + 1));
        // put your code here
    }
}