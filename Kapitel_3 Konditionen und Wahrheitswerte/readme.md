# Wahrheitswerte
Wahrheitswerte ermöglichen es uns, unseren Code in Abhängigkeit von bestimmten Bedingungen auszuführen. In diesem Kapitel werden wir uns die verschiedenen Arten von Wahrheitswerten ansehen, die in Java verfügbar sind.

## Boolesche Werte
Boolesche Werte sind Wahrheitswerte, die entweder `true` oder `false` sein können. Sie werden verwendet, um Bedingungen in Java zu überprüfen. Hier ist ein Beispiel:

```java
boolean a = true;
boolean b = false;
```

## Vergleichsoperatoren
Vergleichsoperatoren werden verwendet, um zwei Werte zu vergleichen. Sie geben einen booleschen Wert zurück, der angibt, ob die Bedingung erfüllt ist oder nicht. Hier ist eine Liste der Vergleichsoperatoren, die in Java verfügbar sind:

| Operator | Beschreibung     | Beispiel mit Zahlen | Ergebnis mit Zahlen | Beispiel mit Strings | Ergebnis mit Strings |
|----------|------------------|--------------------|---------------------|----------------------|----------------------|
| ==       | Gleich           | 10 == 5            | false               | "Hello" == "World"   | false                |
| !=       | Ungleich         | 10 != 5            | true                | "Hello" != "World"   | true                 |
| >        | Größer als       | 10 > 5             | true                | -                    | -                    |
| <        | Kleiner als      | 10 < 5             | false               | -                    | -                    |
| >=       | Größer gleich    | 10 >= 5            | true                | -                    | -                    |
| <=       | Kleiner gleich   | 10 <= 5            | false               | -                    | -                    |

### Strings vergleichen
Strings können nicht mit den Vergleichsoperatoren `==` und `!=` verglichen werden. Stattdessen müssen wir die `equals()`-Methode verwenden. 
Vergleichen wir zwei Strings mit `==` oder `!=`, werden wir die Referenzen der Strings vergleichen. Das bedeutet, dass wir überprüfen, ob die beiden Strings auf das gleiche Objekt verweisen.

Ein Beispiel für den Objektvergleich:

```java
String a = new String("Hello");
String b = new String("Hello");

if (a == b) {
    System.out.println("a ist gleich b"); // Wird nicht ausgeführt
} else {
    System.out.println("a ist ungleich b"); // Wird ausgeführt
}
```


Hier ist ein Beispiel, wie wir zwei Strings mit der `equals()`-Methode vergleichen können:

```java
String a = new String("Hello");
String b = new String("Hello");

if (a.equals(b)) {
    System.out.println("a ist gleich b"); // Wird ausgeführt
} else {
    System.out.println("a ist ungleich b"); // Wird nicht ausgeführt
}
```


## Logische Operatoren
Logische Operatoren werden verwendet, um mehrere Wahrheitswerte zu kombinieren. Hier ist eine Liste der logischen Operatoren, die in Java verfügbar sind:

| Operator | Beschreibung     | Beispiel  | Ergebnis | 
|----------|------------------|--------------------|---------------------|
| &&       | Und              | true && false      | false               | 
| \|\|     | Oder             | true \|\| false    | true                | 
| !        | Nicht            | !true              | false               |



# Konditionen
Konditionen oder auch Verzweigungen sind ein wichtiger Bestandteil der Programmierung. Sie ermöglichen es uns, unseren Code in Abhängigkeit von bestimmten Bedingungen auszuführen. In diesem Kapitel werden wir uns die verschiedenen Arten von Konditionen ansehen, die in Java verfügbar sind.

## if-else
Die `if`-Anweisung ist die grundlegendste Art von Kondition in Java. Sie ermöglicht es uns, einen Codeblock nur dann auszuführen, wenn eine bestimmte Bedingung erfüllt ist. Hier ist ein Beispiel:

```java
int a = 5;
int b = 10;

if (a < b) {
    System.out.println("a ist kleiner als b");
}
```

In diesem Beispiel wird der Code innerhalb der geschweiften Klammern nur dann ausgeführt, wenn die Bedingung `a < b` erfüllt ist. Wenn die Bedingung nicht erfüllt ist, wird der Codeblock übersprungen.

Die `if`-Anweisung kann auch mit einer `else`-Klausel verwendet werden, um einen alternativen Codeblock auszuführen, wenn die Bedingung nicht erfüllt ist. Hier ist ein Beispiel:

```java
int a = 5;
int b = 10;

if (a < b) {
    System.out.println("a ist kleiner als b");
} else {
    System.out.println("a ist größer als b");
}
```

In diesem Beispiel wird der Code innerhalb der geschweiften Klammern nach dem `else`-Schlüsselwort ausgeführt, wenn die Bedingung `a < b` nicht erfüllt ist.

## else if
Die `else-if`-Anweisung ist eine Erweiterung der `if`-Anweisung, die es uns ermöglicht, mehrere Bedingungen zu überprüfen. Hier ist ein Beispiel:

```java
int a = 5;
int b = 10;

if (a < b) {
    System.out.println("a ist kleiner als b");
} else if (a > b) {
    System.out.println("a ist größer als b");
} else {
    System.out.println("a ist gleich b");
}
```

In diesem Beispiel wird der Code innerhalb der geschweiften Klammern nach dem `else if`-Schlüsselwort ausgeführt, wenn die Bedingung `a < b` nicht erfüllt ist. Wenn die Bedingung `a > b` erfüllt ist, wird der Code innerhalb der geschweiften Klammern nach dem `else if`-Schlüsselwort ausgeführt. Wenn keine der Bedingungen erfüllt ist, wird der Code innerhalb der geschweiften Klammern nach dem `else`-Schlüsselwort ausgeführt.

## Nested if
Die `if`-Anweisung kann auch innerhalb eines anderen `if`-Blocks verwendet werden. Dies wird als "verschachtelte" `if`-Anweisung bezeichnet. Hier ist ein Beispiel:

```java
int a = 5;
int b = 10;

if (a < b) {
    if (a > 0) {
        System.out.println("a ist kleiner als b und größer als 0");
    }
}
```

In diesem Beispiel wird der Code innerhalb der geschweiften Klammern nach dem `if`-Schlüsselwort ausgeführt, wenn die Bedingung `a < b` erfüllt ist. Wenn die Bedingung `a > 0` erfüllt ist, wird der Code innerhalb der geschweiften Klammern nach dem `if`-Schlüsselwort ausgeführt.

## Ternärer Operator
Der ternäre Operator ist eine kompakte Möglichkeit, eine `if`-Anweisung in Java zu schreiben. Hier ist ein Beispiel:

```java
int a = 5;
int b = 10;

String result = (a < b) ? "a ist kleiner als b" : "a ist größer als b";
System.out.println(result);
```

## switch

Die `switch`-Anweisung ist eine weitere Möglichkeit, Bedingungen in Java zu verwenden. Sie ermöglicht es uns, einen Codeblock auszuführen, der von einem Ausdruck abhängt. Hier ist ein Beispiel:

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    case 3:
        System.out.println("Mittwoch");
        break;
    // Weitere Fälle...
    default:
        System.out.println("Ungültiger Tag");
}

```

```java
public static void main(String[] args) {
    int day = 3;
    String dayOfWeek = switch (day) {
        case 1, 7 -> "Wochenende";
        case 2, 3, 4, 5, 6 -> "Werktag";
        default -> "Ungültiger Tag";
    };

    System.out.println(dayOfWeek);
}
```

In diesem Beispiel wird der Code innerhalb der geschweiften Klammern nach dem `case`-Schlüsselwort ausgeführt, wenn der Wert von `a` mit dem Wert nach dem `case`-Schlüsselwort übereinstimmt. Wenn keine der Bedingungen erfüllt ist, wird der Code innerhalb der geschweiften Klammern nach dem `default`-Schlüsselwort ausgeführt.

# Challenge 1 - Coffee
Löse die Challenge in der Datein `Challenges/Coffee.java`.  

<svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1045.49609375 597.904296875" width="1045.49609375" height="597.904296875">
  <!-- svg-source:excalidraw -->

  <defs>
    <style class="style-fonts">
      @font-face {
        font-family: "Virgil";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Virgil.woff2");
      }
      @font-face {
        font-family: "Cascadia";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Cascadia.woff2");
      }
      @font-face {
        font-family: "Assistant";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Assistant-Regular.woff2");
      }
    </style>

  </defs>
  <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 613.4864512386696 354.451171875" width="613.4864512386696" height="354.451171875">
  <!-- svg-source:excalidraw -->

  <defs>
    <style class="style-fonts">
      @font-face {
        font-family: "Virgil";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Virgil.woff2");
      }
      @font-face {
        font-family: "Cascadia";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Cascadia.woff2");
      }
      @font-face {
        font-family: "Assistant";
        src: url("https://nextcloud.needful-apps.de/apps/whiteboard/dist//dist/excalidraw-assets/Assistant-Regular.woff2");
      }
    </style>

  </defs>
  <rect x="0" y="0" width="613.4864512386696" height="354.451171875" fill="#ffffff"></rect><g stroke-linecap="round" transform="translate(185.45272283263964 10) rotate(0 114.80577593811151 35.31955025931563)"><path d="M17.66 0 C58.24 1.03, 94.05 2.16, 211.95 0 M17.66 0 C60.86 1.07, 105.34 1.2, 211.95 0 M211.95 0 C222.21 -0.28, 229.74 5.18, 229.61 17.66 M211.95 0 C222.65 1.01, 231.8 4.03, 229.61 17.66 M229.61 17.66 C228.39 27.45, 231.08 34.91, 229.61 52.98 M229.61 17.66 C229.08 26.79, 230.5 34.2, 229.61 52.98 M229.61 52.98 C228.47 64.92, 224.11 69.61, 211.95 70.64 M229.61 52.98 C229.87 63.15, 225.65 72.41, 211.95 70.64 M211.95 70.64 C139.07 69.56, 63.36 70.07, 17.66 70.64 M211.95 70.64 C153.46 72.87, 97.33 72.78, 17.66 70.64 M17.66 70.64 C6.42 69.43, -0.77 63.25, 0 52.98 M17.66 70.64 C5.28 72.21, 2.05 66.97, 0 52.98 M0 52.98 C0.97 38.94, 1.56 26.44, 0 17.66 M0 52.98 C0.84 43.37, 0.23 34.98, 0 17.66 M0 17.66 C-1.07 6.73, 6.02 -1.72, 17.66 0 M0 17.66 C2.16 5.03, 4 2.09, 17.66 0" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(281.5537297468079 39.78204340360509) rotate(0 16.95501180560484 6.944772835575748)"><text x="0" y="0" font-family="Cascadia, Segoe UI Emoji" font-size="11.574621392626238px" fill="#1e1e1e" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="text-before-edge">Start</text></g><g stroke-linecap="round"><g transform="translate(303.23745941055245 81.21783158826258) rotate(0 0.19135860532197047 39.12648950424648)"><path d="M0.73 0.28 C0.71 13.18, 0.65 64.3, 0.44 77.16 M-0.35 -0.63 C-0.57 12.42, -0.85 64.97, -0.48 78.12" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(303.23745941055245 81.21783158826258) rotate(0 0.19135860532197047 39.12648950424648)"><path d="M-10.98 50.02 C-6.98 59.73, -5.64 67.8, -0.48 78.12 M-10.98 50.02 C-8.16 57.09, -6.05 62.39, -0.48 78.12" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(303.23745941055245 81.21783158826258) rotate(0 0.19135860532197047 39.12648950424648)"><path d="M9.54 49.84 C6.48 59.74, 0.75 67.87, -0.48 78.12 M9.54 49.84 C7.65 57.02, 5.05 62.37, -0.48 78.12" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g></g><mask></mask><g stroke-linecap="round" transform="translate(269.53375671075446 159.67884421987955) rotate(0 33.45788996306022 30.797083443700636)"><path d="M42.5 7.75 C49.25 14.42, 53.47 19.2, 58.42 23.25 M42.5 7.75 C46.92 11.12, 51.21 16, 58.42 23.25 M58.42 23.25 C66.82 29.34, 67.68 29.75, 58.42 38.75 M58.42 23.25 C68.15 31.98, 67.05 30, 58.42 38.75 M58.42 38.75 C54.73 44.1, 51.4 46.32, 42.5 53.84 M58.42 38.75 C52.92 43.69, 48.7 46.62, 42.5 53.84 M42.5 53.84 C34.2 60.27, 32.6 63.19, 25.5 53.84 M42.5 53.84 C33.64 62.24, 33.95 59.41, 25.5 53.84 M25.5 53.84 C22.73 48.53, 18.65 44.39, 8.5 38.75 M25.5 53.84 C19.9 49.11, 15.13 44.89, 8.5 38.75 M8.5 38.75 C1.33 31.29, -1.38 29.58, 8.5 23.25 M8.5 38.75 C1.81 32.47, 0.46 29.2, 8.5 23.25 M8.5 23.25 C14.85 15.14, 23.37 8.98, 25.5 7.75 M8.5 23.25 C14.56 18.84, 18.74 14.37, 25.5 7.75 M25.5 7.75 C32.06 0.85, 34.17 -1.98, 42.5 7.75 M25.5 7.75 C34.19 0.53, 32.2 1.49, 42.5 7.75" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(10 273.81207135636873) rotate(0 114.80577593811151 35.31955025931563)"><path d="M17.66 0 C92.09 0.07, 167.08 -0.5, 211.95 0 M17.66 0 C87.24 1.69, 155.79 0.66, 211.95 0 M211.95 0 C222.77 -1.24, 230.59 4.94, 229.61 17.66 M211.95 0 C225.31 1.84, 230.11 7.11, 229.61 17.66 M229.61 17.66 C229.38 30.23, 229.31 42.18, 229.61 52.98 M229.61 17.66 C230.57 25.98, 230.33 35.77, 229.61 52.98 M229.61 52.98 C229.18 66.02, 223.62 72.53, 211.95 70.64 M229.61 52.98 C228.4 66.81, 223.65 69.91, 211.95 70.64 M211.95 70.64 C154.77 71.5, 100.46 69.88, 17.66 70.64 M211.95 70.64 C154.07 69.82, 96.46 68.96, 17.66 70.64 M17.66 70.64 C5.76 69.24, 1.42 62.92, 0 52.98 M17.66 70.64 C6.97 72.12, 0.26 63.09, 0 52.98 M0 52.98 C-1.17 41.78, 1.68 28.49, 0 17.66 M0 52.98 C0.32 44.27, 0.38 33.52, 0 17.66 M0 17.66 C-1.72 5.83, 7.41 0.15, 17.66 0 M0 17.66 C-0.55 6.95, 6 1.79, 17.66 0" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(373.8748993624466 271.8995460246965) rotate(0 114.80577593811151 35.31955025931563)"><path d="M17.66 0 C78.44 -0.05, 136.27 1.42, 211.95 0 M17.66 0 C73.86 -1.48, 129.84 -1.33, 211.95 0 M211.95 0 C224.03 -0.95, 229.33 5.98, 229.61 17.66 M211.95 0 C221.56 1.13, 229.98 5.9, 229.61 17.66 M229.61 17.66 C228.01 29.97, 229.82 46.66, 229.61 52.98 M229.61 17.66 C230.55 25.8, 229.89 33.47, 229.61 52.98 M229.61 52.98 C231.61 63.36, 221.9 69.3, 211.95 70.64 M229.61 52.98 C230.9 63.37, 225.12 68.94, 211.95 70.64 M211.95 70.64 C133.35 68.34, 57.04 72.03, 17.66 70.64 M211.95 70.64 C167.26 69.07, 122.59 70.54, 17.66 70.64 M17.66 70.64 C6.89 68.8, 1.26 66.32, 0 52.98 M17.66 70.64 C4.29 71.84, 0.53 66.81, 0 52.98 M0 52.98 C-0.85 37.88, -0.51 23.33, 0 17.66 M0 52.98 C0.64 40.06, 0.57 27.91, 0 17.66 M0 17.66 C1.78 7.36, 7.52 1.17, 17.66 0 M0 17.66 C2.17 3.76, 4.18 -0.22, 17.66 0" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(89.07139305661875 308.1346669215148) rotate(0 30.519021250088713 6.944772835575744)"><text x="0" y="0" font-family="Cascadia, Segoe UI Emoji" font-size="11.574621392626238px" fill="#1e1e1e" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="text-before-edge">Fülle auf</text></g><g transform="translate(443.2548076709816 306.39847371262084) rotate(0 71.21104958354033 6.944772835575744)"><text x="0" y="0" font-family="Cascadia, Segoe UI Emoji" font-size="11.574621392626238px" fill="#1e1e1e" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="text-before-edge">Der Kaffee ist fertig</text></g><g stroke-linecap="round"><g transform="translate(334.6884760773327 189.83389788320795) rotate(0 82.8105383268148 40.85253577854468)"><path d="M0.85 -0.99 C24.76 0.18, 116.06 -6.56, 143.72 7.35 C171.38 21.27, 163 70.25, 166.8 82.49 M-0.16 1.1 C24.11 1.9, 118.25 -7.66, 146.05 5.58 C173.85 18.82, 163.12 67.91, 166.65 80.56" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(334.6884760773327 189.83389788320795) rotate(0 82.8105383268148 40.85253577854468)"><path d="M155.3 52.79 C157.39 60.5, 163.84 72.67, 166.65 80.56 M155.3 52.79 C159.84 63.05, 162.83 73.73, 166.65 80.56" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(334.6884760773327 189.83389788320795) rotate(0 82.8105383268148 40.85253577854468)"><path d="M175.81 52 C171.25 60.11, 171.05 72.54, 166.65 80.56 M175.81 52 C172.85 62.39, 168.35 73.37, 166.65 80.56" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g></g><mask></mask><g stroke-linecap="round"><g transform="translate(268.59784005908506 189.36141822089175) rotate(0 -76.89663020901983 42.032604600214775)"><path d="M0.34 0.21 C-22.88 1.34, -112.51 -7.48, -138.31 6.53 C-164.11 20.53, -151.78 71.29, -154.44 84.27 M-0.94 -0.72 C-23.87 0.62, -110.24 -6.38, -136.01 8.02 C-161.78 22.42, -152.5 72.75, -155.54 85.69" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(268.59784005908506 189.36141822089175) rotate(0 -76.89663020901983 42.032604600214775)"><path d="M-164.81 57.16 C-160.95 66.76, -157.88 77.94, -155.54 85.69 M-164.81 57.16 C-161.35 65.84, -159.72 74.89, -155.54 85.69" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g><g transform="translate(268.59784005908506 189.36141822089175) rotate(0 -76.89663020901983 42.032604600214775)"><path d="M-144.3 57.87 C-148.3 67.26, -153.09 78.16, -155.54 85.69 M-144.3 57.87 C-147.34 66.38, -152.2 75.21, -155.54 85.69" stroke="#1e1e1e" stroke-width="1" fill="none"></path></g></g><mask></mask><g transform="translate(286.5136358670075 174.99713221918333) rotate(0 16.95501180560484 13.889545671151481)"><text x="0" y="0" font-family="Cascadia, Segoe UI Emoji" font-size="11.574621392626238px" fill="#1e1e1e" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="text-before-edge">Tasse</text><text x="0" y="13.889545671151485" font-family="Cascadia, Segoe UI Emoji" font-size="11.574621392626238px" fill="#1e1e1e" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="text-before-edge">voll?</text></g></svg>

