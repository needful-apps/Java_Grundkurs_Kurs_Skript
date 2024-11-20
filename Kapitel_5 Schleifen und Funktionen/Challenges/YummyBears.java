// Werkstudent Hannes wurde in der QA damit beauftragt, aufzuschreiben, wie viele Yummy-Bears, je Farbe in einer Tüte
// sind. Hannes hat seine Aufgabe nicht richtig verstanden und hat hintereinander weg, Buchstaben aufgeschrieben, welche
// die Farbe eines Yummy-Bears repräsentieren. Er hat dabei keine
// Rücksicht darauf genommen, ob er nun einen Großbuchstaben verwendet oder nicht.
// w/W = weiß
// o/O = orange
// y/Y = Gelb
// r/R = Rot
// p/P = Purpur
// g/G = Grün
// Schreibe ein Programm, das die Anzahl an verschiedenen Yummy-Bears zählt und diese ausgibt.
// Das Programm soll dann, nach den folgenden Kriterien entscheiden, ob die Tüte den Qualitätsansprüchen genügt und gibt
// Entweder "Bestanden" oder ein Kriterium aus, an dem es gescheitert ist.
// 
// Es müssen mehr weiße als rote Yummies in der Tüte sein.
// Es müssen weniger gelbe als orange Yummies in der Tüte sein.
// Es müssen mindestens 84 und maximal 85 Yummies in der Tüte sein.
// Es müssen je Farbe mindestens 10 Yummies in der Tüte sein.
// Rote und purpurenen Yummies dürfen zusammen maximal 30 ergeben.
// Wenn mehr purpurene als gelbe Yummies in der Tüte sind müssen mehr weiße als rote in der Tüte sein.
//
// Um ein Zeichenn aus der Zeichenkette zu bekommen, kannst du die Methode charAt() verwenden.


public class YummyBears {
    public static void main(String[] args) {
        String bag = "wOpoRYGWoyworoyOoWyoprorrWYRYrgOgRowwrWgPpypwrPwpwypwRywPYPRrwpYGwpWGwYGgwWOorgpyorPY";

        int white = 0;
        int orange = 0;
        int yellow = 0;
        int red = 0;
        int purple = 0;
        int green = 0;

        for (int i = 0; i < bag.length(); i++) {
            char bear = bag.charAt(i);
            switch (bear) {
                case 'w':
                case 'W':
                    white++;
                    break;
                case 'o':
                case 'O':
                    orange++;
                    break;
                case 'y':
                case 'Y':
                    yellow++;
                    break;
                case 'r':
                case 'R':
                    red++;
                    break;
                case 'p':
                case 'P':
                    purple++;
                    break;
                case 'g':
                case 'G':
                    green++;
                    break;
            }
        }

        if (white <= red) {
            System.out.println("Failed: There are not more white than red Yummies in the bag.");
        } else if (yellow >= orange) {
            System.out.println("Failed: There are not less yellow than orange Yummies in the bag.");
        } else if (white < 10 || orange < 10 || yellow < 10 || red < 10 || purple < 10 || green < 10) {
            System.out.println("Failed: There are not at least 10 Yummies of each color in the bag.");
        } else if (purple + red > 30) {
            System.out.println("Failed: There are more than 30 red and purple Yummies in the bag.");
        } else if (purple > yellow) {
            if (white <= red) {
                System.out.println("Failed: There are more purple than yellow Yummies in the bag and not more white than red.");
            }
        } else if (white + orange + yellow + red + purple + green != 84 && white + orange + yellow + red + purple + green != 85) {
            System.out.println("Failed: There are not 84 or 85 Yummies in the bag.");
        } else {
            System.out.println("Passed: The bag meets the quality requirements.");
        }
    }
}
