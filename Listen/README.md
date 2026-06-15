# Listen in Java

Dieses Projekt ist eine einfache Konsolenanwendung fuer eine doppelt verkettete Liste mit Strings.

## Erfuellte Anforderungen

- Eigene Klasse `LinkedStringList`
- Verkettete Liste mit `head`, `tail` und `cursor`
- Eingabe von Strings bis zur Eingabe von `X`
- Dynamisches Einfuegen neuer Elemente am Ende der Liste
- Durchlaufen der Liste mit `next()` und `prev()`
- Sortierfunktion fuer die fertige Liste
- Loeschfunktion fuer das aktuelle Element, auf dem der Cursor steht

## Wichtige Funktionen der Klasse `LinkedStringList`

| Funktion | Beschreibung |
|---|---|
| `add(String value)` | Fuegt einen neuen String am Ende der Liste hinzu. |
| `next()` | Bewegt den Cursor ein Element nach rechts, wenn ein naechstes Element existiert. |
| `prev()` | Bewegt den Cursor ein Element nach links, wenn ein vorheriges Element existiert. |
| `current()` | Gibt den Wert des aktuellen Cursor-Elements zurueck. |
| `deleteCurrent()` | Loescht das Element, auf dem der Cursor aktuell steht. |
| `sort()` | Sortiert die Liste alphabetisch. Danach steht der Cursor am Anfang. |
| `moveToHead()` | Setzt den Cursor auf das erste Element der Liste. |
| `moveToTail()` | Setzt den Cursor auf das letzte Element der Liste. |
| `size()` | Gibt die Anzahl der Elemente in der Liste zurueck. |
| `isEmpty()` | Gibt `true` zurueck, wenn die Liste leer ist. |
| `toDetailedString()` | Gibt die Liste als Text aus und markiert die Cursor-Position mit eckigen Klammern. |

## Start in IntelliJ IDEA

1. ZIP-Datei entpacken.
2. IntelliJ IDEA oeffnen.
3. `File` -> `Open` waehlen.
4. Den Ordner `listen` auswaehlen.
5. Datei `src/Main.java` oeffnen.
6. Neben `public static void main` auf den gruenen Play-Button klicken.

## Kompilieren ohne IntelliJ

```bash
javac src/*.java
java -cp src Main
```
