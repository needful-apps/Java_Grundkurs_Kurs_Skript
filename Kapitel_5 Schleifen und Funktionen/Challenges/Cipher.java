// Schreibe eine App, welche folgende Aufgaben erfüllt:
// Task-1: Erstelle eine Funktion askForData, welche folgende Informationen erfragt:
//           * Frage die Nutzer*in, ob diese (V)erschlüsseln oder (E)ntschlüsseln möchte
//           * Frage die Nutzer*in, wie viele Zeichen verschoben wird, bzw. wurde.
//           * Frage die Nutzer*in, wie die Nachricht lautet
//           * Rufe die Funktion crypt mit den Argumenten auf.
// Task-2: Schreibe eine Funktion crypt welche:
//           * die oben genannten Argumente annimmt
//           * je nachdem ob es sich um eine Ver- oder Ent-schlüsselung handelt,
//             die Nachricht in die eine oder andere Richtung verschiebt
// Task-3: Rufe askForData auf.
// Task-4: Nachdem Die (Ent-)Schlüsselung beendet wurde, fragt das Programm,
//         ob ein weiterer Durchlauf gestartet werden soll
// Hinweise:
// * Mit der Methode split("") kannst du einen String in einzelne Zeichen aufteilen (z.B. "Hallo".split("") -> ["H", "a", "l", "l", "o"], message.split("") -> ["H", "a", "l", "l", "o"])
// * Mit der Methode indexOf kannst du den Index eines Zeichens in einem Array finden (z.B. alphabet.indexOf("a") -> 0, alphabet.indexOf("b") -> 1


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList( "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "ä", "ö", "ü", "ß", " " ));

      
    }
}
