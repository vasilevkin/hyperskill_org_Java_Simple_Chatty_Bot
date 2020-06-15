import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        boolean endsWithBurg = false;

        if (city.length() >= 4) {
            endsWithBurg = city.endsWith("burg");
        }

        System.out.println(endsWithBurg);
        // put your code here
    }
}