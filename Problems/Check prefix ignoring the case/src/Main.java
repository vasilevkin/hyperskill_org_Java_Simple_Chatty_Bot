import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var string = scanner.nextLine();

        System.out.println(string.toUpperCase().startsWith("J"));
        // put your code here
    }
}