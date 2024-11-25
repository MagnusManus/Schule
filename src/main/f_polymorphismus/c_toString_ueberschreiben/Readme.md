## Lernziele:
- Polymorphismus
- toString-Methode überschreiben

## Lektionsinhalt:
- In der Java-Klasse Objects gibt es eine Methode `toString()`.
- Alle Objekte in Java (also auch von selbstgeschriebenen Klassen) erben von der Klasse Objects.
- Wenn man ein Objekt als Übergabeparameter in die System.out.println-Methode übergibt, wird automatisch die entsprechende toString-Methode ausgeführt.
- Bedeutung der Konsolenausgabe, falls toString-Methode nicht überschrieben wurde
- Es macht Sinn, die toString-Methode jeder Klasse mit etwas Sinnvollerem zu überschreiben

## Übungsaufgaben (sind jeweils im Unterordner uebungen zu lösen):
- [ ] Erstelle eine Klasse `Stift`. In dieser:
  - [ ] Initialisiere die Objektattribute `farbe` (String, default = "") und `gespitzt` (boolean, default = true)
  - [ ] Schreibe die Getter und Setter für diese beiden Objektattribute

- [ ] Schreibe eine Klasse `Main` mit einer main-Methode. In dieser: 
  - [ ] Instantiiere einen Stift.
  - [ ] Gib auf der Konsole aus, ob der Stift gespitzt ist.
  - [ ] Setze den Stift per Setter auf nicht gespitzt.
  - [ ] Gib auf der Konsole aus, ob der Stift gespitzt ist.
  - [ ] Setze die Farbe des Stifts per Setter auf "lila".
  - [ ] Gib den Stift auf der Konsole aus (also einfach die Variable, die den Stift enthält).

- In der Klasse `Stift`:
  - [ ] Überschreibe die toString-Methode mit einer sinnvollen Ausgabe

- In der Klasse `Main`:
    - [ ] Gib den Stift auf der Konsole aus (also einfach die Variable, die den Stift enthält).
