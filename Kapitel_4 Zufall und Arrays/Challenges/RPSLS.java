import java.util.Random;
import java.util.Scanner;

public class RPSLS {
    public static void main(String[] args) {
        String[] hands = {
            "STEIN\n\n    _______\n---'   ____\n      (_____)\n      (_____)\n      (____)\n---.__(___)\n",
            "SCHERE\n\n    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)\n",
            "PAPIER\n\n     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)\n",
            "ECHSE\n\n      ___________\n---/'  __________)\n    (_________    \n---.__________)\n",
            "SPOCK\n\n     _______\n---/'   ____)____\n           ______)\n         ________)\n        (_______\n         _______)\n---.__________)\n"
        };
        
        // Dein Code nach dieser Zeile

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomHand = random.nextInt(hands.length);

        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Deine Eingabe:\n" + hands[input]);


        // Dein Code vor dieser Zeile

    }
}
