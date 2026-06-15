LBS Eibiswald Gmeinbauer ITL2 Liste


# Listen in Java

Dieses Projekt ist eine einfache Java-Konsolenanwendung zur Verwaltung einer doppelt verketteten Liste mit Strings.

## Aufgabenbeschreibung

Das Programm liest mehrere Strings vom Benutzer ein und speichert diese in einer eigenen verketteten Liste. Die Eingabe endet, sobald der Benutzer `X` eingibt.

Nach der Eingabe kann die Liste über ein Menü bedient werden. Dabei können Elemente angezeigt, sortiert, gelöscht und der Cursor innerhalb der Liste bewegt werden.

## Projektinhalt

Das Projekt besteht hauptsächlich aus zwei Java-Dateien:

- `Main.java`  
  Enthält das Hauptprogramm, die Benutzereingabe und das Menü.

- `LinkedStringList.java`  
  Enthält die selbst programmierte doppelt verkettete Liste.

## Funktionen

Das Programm erfüllt folgende Anforderungen:

- eigene Listenklasse `LinkedStringList`
- Speicherung von Strings in einer doppelt verketteten Liste
- Eingabe von Strings bis zur Eingabe von `X`
- Einfügen neuer Elemente am Ende der Liste
- Cursor zum Navigieren durch die Liste
- Bewegung mit `next()` und `prev()`
- Anzeige des aktuellen Elements
- Löschen des aktuellen Elements
- alphabetisches Sortieren der Liste
- Anzeige der Liste mit markierter Cursorposition

## Wichtige Methoden

| Methode | Beschreibung |
|---|---|
| `add(String value)` | Fügt einen neuen String am Ende der Liste hinzu. |
| `next()` | Bewegt den Cursor ein Element nach rechts. |
| `prev()` | Bewegt den Cursor ein Element nach links. |
| `current()` | Gibt das aktuelle Element zurück. |
| `deleteCurrent()` | Löscht das Element, auf dem der Cursor steht. |
| `sort()` | Sortiert die Liste alphabetisch. |
| `moveToHead()` | Setzt den Cursor auf das erste Element. |
| `moveToTail()` | Setzt den Cursor auf das letzte Element. |
| `size()` | Gibt die Anzahl der Elemente zurück. |
| `isEmpty()` | Prüft, ob die Liste leer ist. |
| `toDetailedString()` | Gibt die Liste als Text aus und markiert den Cursor. |

## Bedienung

Beim Start des Programms werden zuerst Strings eingegeben.

Beispiel:

```text
Wert eingeben (X = fertig): Apfel
Wert eingeben (X = fertig): Banane
Wert eingeben (X = fertig): Kirsche
Wert eingeben (X = fertig): X
