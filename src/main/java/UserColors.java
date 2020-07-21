import java.util.Scanner;

public class UserColors {
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter (B-blue, G-grey, Y-yellow, W-white, P-pink, O-orange):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B" : return "Blue";
                case "G" : return "Grey";
                case "Y" : return "Yellow";
                case "W" : return "White";
                case "P" : return "Pink";
                case "O" : return "Orange";
                default:
                    System.out.println("Wrong letter. Try again.");
            }

        }
    }
}
