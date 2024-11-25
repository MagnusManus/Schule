## Lernziele:
- Polymorphismus (Methoden überladen)

## Lektionsinhalt:
- Unterklasse überschreibt Methode einer Oberklasse
- Es wird immer die spezialisierteste Methode ausgeführt
- `@Override` Annotation (Vorteile: bessere Lesbarkeit für Entwickler und IDE erkennt Tippfehler)
- `super` Keyword
- spezialisierte Methode bleibt auch beim Casten in eine Oberklasse erhalten (Casten ändert nur die Schablone, durch die man ein Objekt betrachtet)

## Übungsaufgaben (sind jeweils im Unterordner uebungen zu lösen):
- [ ] Erstelle die Klassen `Veranstaltungsort`, `Kino` und `Theater`.
- [ ] Sowohl `Kino` als auch `Theater` erben von `Veranstaltungsort`.


- [ ] Schreibe in allen drei Klassen eine Methode `verkaufeEssen` mit leerem Rückgabewert und ohne Übergabeparameter.
- [ ] Denke bei zwei dieser Methoden an die `@Override` Annotation
- [ ] Gib in der `verkaufeEssen` Methode der Klasse `Veranstaltungsort` auf der Konsole "Wir verkaufen frisches Essen." aus.
- [ ] Rufe in der `verkaufeEssen` Methode der Klasse `Kino` auf der Konsole zunächst per `super` Keyword die gleichnamige Methode der Oberklasse auf und in der nächsten Zeile: "Und das Essen, dass wir verkaufen ist Popcorn und Cola." aus.
- [ ] Rufe in der `verkaufeEssen` Methode der Klasse `Theater` auf der Konsole zunächst per `super` Keyword die gleichnamige Methode der Oberklasse auf und in der nächsten Zeile: "Und das Essen, dass wir verkaufen ist Weißwein und Käse-Trauben-Sticks." aus.


- [ ] Schreibe eine Main-Klasse mit einer main-Methode, in dieser:
- [ ] Erzeuge jeweils ein Objekt der drei Klassen.
- [ ] Rufe für jedes der Objekte die `verkaufeEssen` Methode auf.
