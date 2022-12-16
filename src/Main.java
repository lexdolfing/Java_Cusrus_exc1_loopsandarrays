import java.util.Objects;
import java.util.Scanner;




//MEDEDELING VOOR PEER-REVIEWER: MAIN EN HOMEWORK-LEX BRANCHES ZIJN HETZELFDE OMDAT IK EERST ALLES IN DE MAIN GEPUSHT HAD
public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] alphabetic = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};

        Translator banaan = new Translator(alphabetic, numeric);
        boolean play = true;
        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine().toLowerCase();
            if (Objects.equals(input, "x")) {
                play = false;
            } else if (input.equalsIgnoreCase("v")) {
                System.out.println("typ een cijfer van 0 tot 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = banaan.translate(number);
                    System.out.println("De vertaling van: " + number + " is: " + result);
                } else {
                    System.out.println(ongeldig);
                }
            }
            else{
                System.out.println(ongeldig +  "je hebt foute input gegeven");
            }
        }


    }

}
