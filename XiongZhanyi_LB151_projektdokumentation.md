# Projekt-Dokumentation

✍️ Ihr Nachname: Xiong

| Datum | Version | Zusammenfassung                                              
| ----- | ------- | ------------------------------------------------------------ 
| 09.01 | 0.0.1   | Projekt-Dokumentation Analyse "Beschreiben Sie, auf welchem Tier Sie die dynamischen Elemente der Anwendung unterbringen möchten:"
|       | 0.0.2   |                                                              
|       | 0.0.3   |                                                              
|       | 0.0.4   |                                                              
|       | 0.0.5   |                                                              
|       | 0.0.6   |                                                              
|       | 1.0.0   |                                                              

# 0 Ihr Projekt

✍️ Beschreiben Sie Ihr Projekt in einem griffigen Satz.

# 1 Analyse

✍️ Beschreiben Sie, auf welchem Tier Sie die dynamischen Elemente der Anwendung unterbringen möchten:

* Tier 1 (Presentation): 
* index.xhtml ()
* 
* Tier 2 (Webserver):
* Tier 3 (Application Server):
* Tier 4 (Dataserver):

# 2 Technologie

✍️ Beschreiben Sie für dieselben Tiers, welche Programmiersprache bzw. Technologie Sie verwenden möchten.
JSF

# 3 Datenbank

✍️ Wie steuern Sie Ihre Datenbank an? Wie ist das Interface aufgebaut?
JDBC, MySQL, XAMPP mit MariaDB

# 4.1 User Stories

✍️ Formulieren Sie klare Anforderungen in der Form von User Stories (*„als … möchte ich … damit …“*) und zu jeder Anforderung mindestens einen dazugehörigen Testfall (in Kapitel 4.2). 

✍️ Formulieren Sie weitere, eigene Anforderungen und Testfälle, wie Sie Ihre Applikation erweitern möchten. Geben Sie diesen statt einer Nummer einen Buchstaben (`A`, `B`, etc.)

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1    | Muss                | Funktional | Als ein Administrator möchte ich mich mithilfe von einem Benutzername und einem Passwort authentifizieren können, damit nicht jeder Daten bearbeiten, hinzufügen oder löschen können. |
| 2  | Muss                | Funktional | Als ein Administrator möchte ich Phrasen und Rätselwörter anlegen können, damit das Spiel mit neuen Phrasen und Rätselwörter erweitert werden kann. |
| 2  | Muss                | Funktional | Als ein Administrator möchte ich Phrasen und Rätselwörter abändern und löschen können, damit vorhandene Fehlern behoben werden können. |
| 3  | Muss | Funktional | Als ein Administrator möchte ich Kategorien anlegen können, damit das Spiel facettenreicher wird. |
| 4  | Muss | Funktional | Als ein Administrator möchte ich jedes Wort bzw. jede Frage einer Kategorie zuordnen können, damit der Benutzer eine Kategorie für das Spiel mit den entsprechend zugeordnete Wörter bzw. Fragen auswählen können. |
| 5  | Muss | Funktional | Als ein Administrator möchte ich Einträge der Highscore-Liste löschen, damit Spieler die Bug abusing betrieben haben von der Highscore-Liste entfernt werden können. |
|   | Muss | Randbedingung | Als Auftraggeber möchte ich eine Webbrowserapplikation vom abgewandelte Version vom Glückrad, damit das Spiel auf jedem Gerät im Webbrowsser gespielt werden kann. |
|   | Muss | Funktional | Als ein Kanditat möchte ich einen Namen angeben können, damit ich mich mit anderen Spielern messen kann. |
|   | Muss | Funktional | Als ein Kanditat möchte ich zur jeder Zeit mein Kontostand sehen, damit ich motiviert werden einen möglichst hohen Geldbetrag zu erspielen. |
|   | Muss | Funktional | Als ein Kanditat möchte ich zur jeder Zeit meine Lebenpunkte sehen, damit ich weiss wie viele Vokale ich noch erkaufen kann. |
|   | Muss | Funktional | Als ein Kanditat möchte ich dass mir mitgeteilt wird ob meine Antwort richtig oder falsch war, damit ein Glücksgefühl bei einer richtigen Antwort ausgelöst wird. |
|   | Muss | Funktional | Als ein Kanditat möchte ich Rang, Name des Spielers, Zeitpunkt des Spiels, Geldbetrag und Anzahl Spielrunden in der Hightscore-Liste sehen, damit ich mich mit anderen Spielern vergleichen kann und motiviert werde mich mit anderen Spielern zu messen. |
|   | Muss | Funktional | Als ein Kanditat möchte ich das die Highscore-Liste nach dem Geldbetrag absteigend sortiert wird, damit ich motiviert werde, so lange zu spielen, bis ich an der Spitze bin. |
|   | Muss | Funktional |  |

✍️ Jede User Story hat eine ganzzahlige Nummer (1, 2, 3 etc. oder Zahl), eine Verbindlichkeit (Muss oder Kann?), und einen Typ (Funktional, Qualität, Rand). 

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |              |         |                   |
| ...  |              |         |                   |

✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

# 5 Prototyp

✍️ Erstellen Sie Prototypen für das GUI (Admin-Interface und Quiz-Seite).

# 6 Implementation

✍️ Halten Sie fest, wann Sie welche User Story bearbeitet haben

| User Story | Datum | Beschreibung |
| ---------- | ----- | ------------ |
| ...        |       |              |

# 7 Projektdokumentation

| US-№ | Erledigt? | Entsprechende Code-Dateien oder Erklärung |
| ---- | --------- | ----------------------------------------- |
| 1    | ja / nein |                                           |
| ...  |           |                                           |

# 8 Testprotokoll

✍️ Fügen Sie hier den Link zu dem Video ein, welches den Testdurchlauf dokumentiert.

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |       |          |        |
| ...  |       |          |        |

✍️ Vergessen Sie nicht, ein Fazit hinzuzufügen, welches das Test-Ergebnis einordnet.

# 9 `README.md`

✍️ Beschreiben Sie ausführlich in einer README.md, wie Ihre Applikation gestartet und ausgeführt wird. Legen Sie eine geeignete Möglichkeit (Skript, Export, …) bei, Ihre Datenbank wiederherzustellen.

# 10 Allgemeines

- [ ] Ich habe die Rechtschreibung überprüft
- [ ] Ich habe überprüft, dass die Nummerierung von Testfällen und User Stories übereinstimmen
- [ ] Ich habe alle mit ✍️ markierten Teile ersetzt
