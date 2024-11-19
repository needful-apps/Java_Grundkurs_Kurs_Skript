// Schreibe ein Interface SelfCleaningInterface (SelfCleaningInterface.java), welches folgende Methoden deklariert:
// > startCleaning
//   Diese Methode startet den Selbstreinigungsprozess des Endgerätes.
//   Der Vorgang kann von Gerät zu Gerät variieren.
// > checkIfDirty
//   Diese Methode prüft, ob ein Gerät gereinigt werden muss.
//   Gibt True aus, falls das Gerät gereinigt werden muss. Andernfalls False.
//
// Erstelle eine abstracte Klasse Appliance, welche die Eigenschaften: name und runCyclesCount hat.
// Diese soll folgende Eigenschaften haben:
// > runCyclesCount ist ein Integer, welcher die Anzahl der Reinigungsvorgänge zählt und initial auf 0 gesetzt ist.
// > Einen Getter für runCyclesCount
// > Eine Methode AddRunCycle, welche den runCyclesCount um 1 erhöht.
// > Einen Konstruktor, welcher den Namen des Gerätes setzt.
//
// Erstelle eine Klasse Dishwasher, welches SelfCleaningInterface implementiert:
// > checkIfDirty gibt True aus, wenn runCyclesCount > 10 ist
// > startCleaning - gibt per print() aus, dass gereinigt wird und setzt anschließend runCyclesCount auf null (0).
// Die Klassen CoffeeMaker und Dishwasher sollen von der Klasse Appliance erben.
//
// Erstelle eine Klasse CoffeeMaker, welches SelfCleaningInterface implementiert:
// > checkIfDirty gibt True per Zufall aus
// > startCleaning - gibt per print() aus, dass gereinigt wird und setzt anschließend runCyclesCount auf null (0).
//
// Lege in App.java je einen Dishwasher als auch einen CoffeeMaker an.
// Setze den runCyclesCount für den Dishwasher auf 15.
// Prüfe beide Geräte, ob sie gereinigt werden müssen und starte ggf. den Reinigungsprozess.

public class App {
    public static void main(String[] args) throws Exception {

    }
}
