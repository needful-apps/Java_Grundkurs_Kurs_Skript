// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigureAscii {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> treasureMap = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("O", "O", "O")),
            new ArrayList<>(Arrays.asList("O", "O", "O")),
            new ArrayList<>(Arrays.asList("O", "O", "O"))
        ));
        String baboonFigure = "B";
        printMap(treasureMap);

       // Dein Code hier:

       // Ende deines Codes

        printMap(treasureMap);
    }

    private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
        System.out.println("1 " + String.join("", treasureMap.get(0)));
        System.out.println("2 " + String.join("", treasureMap.get(1)));
        System.out.println("3 " + String.join("", treasureMap.get(2)));
        System.out.println("  1 2 3");
    }
}
