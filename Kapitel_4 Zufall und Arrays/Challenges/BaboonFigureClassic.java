// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.
// Spieler*in gibt ein 1,2
// Braune Klotz in Zeile 1 und Spalte 2 wird durch Affen-Emoji ersetzt.
// Nutzereingabe nicht 0-basiert

import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigure {
    public static void main(String[] args) {
        String[][] treasureMap = {
                {"🟫", "🟫", "🟫"},
                {"🟫", "🟫", "🟫"},
                {"🟫", "🟫", "🟫"}
        };
        String baboonFigure = "🐒";
        printMap(treasureMap);

        // Dein Code hier:

        // Ende deines Codes

        printMap(treasureMap);
    }

    private static void printMap(String[][] treasureMap) {
        System.out.println("1️⃣ " + String.join("", treasureMap[0]));
        System.out.println("2️⃣ " + String.join("", treasureMap[1]));
        System.out.println("3️⃣ " + String.join("", treasureMap[2]));
        System.out.println("  1️⃣ 2️⃣ 3️⃣");
    }
}
