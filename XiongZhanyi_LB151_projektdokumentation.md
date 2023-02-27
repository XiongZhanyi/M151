# Projekt-Dokumentation

✍️ Ihr Nachname: Xiong

| Datum | Version | Zusammenfassung                                              
| ----- | ------- | ------------------------------------------------------------ 
| 09.01.2023 | 0.0.1   | Projekt-Dokumentation Analyse "Beschreiben Sie, auf welchem Tier Sie die dynamischen Elemente der Anwendung unterbringen möchten:"
| 22.01.2023 | 0.0.2   | GUI Prototyp                                                         
| 13.02.2023 | 0.0.3   | Spiel Programmiere
| 26.02.2023 | 0.0.4   | Adminfunktionen Programmieren
| 27.02.2023 | 0.0.5   | Testen, Abgabe
|       | 0.0.6   |                                                              
|       | 1.0.0   |                                                              

# 0 Ihr Projekt

Ein Glücksrad Spiel, bei der der Spieler ein Glücksrad drehen kann und daraufhin ein Konsonant von einem Rätselwort oder Phrase erraten kann. 
Falls der Rateversuch erfolgreich ist, wird anhand von gedrehtem Glücksrad die gewonnene Geldmenge zum Konto addiert. 
Falls der Rateversuch fählschlägt wird dem Spieler 1 von 3 Hearts abgezogen. 

# 1 Analyse

* Tier 1 (Presentation): 
  * Eingabe Username
  * Eingabe Adminbenutzername und Passwort
  * Highscore Liste (Rang, Name, Geldbetrag, Anzahl Runden, Zeitpunkt)
  * Glücksrad Drehen
  * Kontoguthaben
  * Lebenspunkte
  * Konsonant erraten
  * Vokal kaufen
  * Rätselwort erraten
  * Administration von Phrasen und Rätselwörter (Löschen, Anlegen, Ändern)
  * Administration von Kategorien
  * Highscore Einträge löschen
* Tier 2 (Webserver):
  * Verwaltung von Glücksrad Spiel
  * Prüfung von Eingaben
  * Weiterleitung an Application Server
* Tier 3 (Application Server):
  * Glücksrad Spielmechanik
  * Kategorie
  * Rätselwort
* Tier 4 (Dataserver):
  * Highscore DAO
  * Adminstrator DAO
  * Fortunewheel DAO
  
# 2 Technologie

Tier 1 .xhtml, Primefaces, JSF
Tier 2 JSF, Java 
Tier 3 Java
Tier 4 Java, JDBC

# 3 Datenbank

Mithilfe von JDBC steuere ich meine Datenbank an. 
MySQL, XAMPP mit MariaDB

# 4.1 User Stories

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1    | Muss                | Funktional | Als ein Administrator möchte ich mich mithilfe von einem Benutzername und einem Passwort authentifizieren können, damit nicht jeder Daten bearbeiten, hinzufügen oder löschen können. |
| 2  | Muss                | Funktional | Als ein Administrator möchte ich Phrasen und Rätselwörter anlegen können, damit das Spiel mit neuen Phrasen und Rätselwörter erweitert werden kann. |
| 3 | Muss                | Funktional | Als ein Administrator möchte ich Phrasen und Rätselwörter abändern und löschen können, damit vorhandene Fehlern behoben werden können. |
| 4  | Muss | Funktional | Als ein Administrator möchte ich Kategorien anlegen können, damit das Spiel facettenreicher wird. |
| 5  | Muss | Funktional | Als ein Administrator möchte ich jedes Wort bzw. jede Frage einer Kategorie zuordnen können, damit der Benutzer eine Kategorie für das Spiel mit den entsprechend zugeordnete Wörter bzw. Fragen auswählen können. |
| 6  | Muss | Funktional | Als ein Administrator möchte ich Einträge der Highscore-Liste löschen, damit Spieler die Bug abusing betrieben haben von der Highscore-Liste entfernt werden können. |
| 7 | Muss | Funktional | Als ein Spieler möchte ich Rang, Name des Spielers, Zeitpunkt des Spiels, Geldbetrag und Anzahl Spielrunden in der Hightscore-Liste sehen, damit ich mich mit anderen Spielern vergleichen kann und motiviert werde mich mit anderen Spielern zu messen. |
| 8 | Muss | Funktional | Als ein Spieler möchte ich jederzeit aufhören können, damit mein Geldbetrag in die Highscore Liste übernommen wird. |
| 9 | Muss | Funktional | Als ein Spieler möchte ich einen Namen angeben können, damit ich mich mit anderen Spielern messen kann. |
| 10 | Muss | Qualität | Als ein Spieler möchte ich zur jeder Zeit mein Kontostand sehen, damit ich motiviert werden einen möglichst hohen Geldbetrag zu erspielen. |
| 11 | Muss | Qualität | Als ein Spieler möchte ich zur jeder Zeit meine Lebenpunkte sehen, damit ich weiss wie viele Fehlversuche ich habe beim erraten eines Vokals.
| 12 | Muss | Qualität | Als ein Spieler möchte ich dass mir mitgeteilt wird ob meine Antwort richtig oder falsch war, damit ein Glücksgefühl bei einer richtigen Antwort ausgelöst wird. |
| 13 | Muss | Qualität | Als ein Spieler möchte ich das die Highscore-Liste nach dem Geldbetrag absteigend sortiert wird, damit ich motiviert werde, so lange zu spielen, bis ich an der Spitze bin. |
| 14 | Muss | Qualität | Als ein Spieler möchte ich, dass ein Rätselwort nur einmal gestellt wird, damit das Spiel nicht langweilig wird. |
| 15 | Muss | Qualität | Als ein Spieler möchte ich, dass Benutzereingaben Clientseitig Überprüft wird, damit nicht jede Eingabe an den Server gesendet werden muss. |
| 16 | Muss | Qualität | Als ein Administrator möchte ich, dass Benutzereingaben Serverseitig Überprüft wird, damit im System keine Fehler auftauchen. |
| 17 | Muss | Randbedingung | Als ein Administrator möchte ich eine Webbrowserapplikation vom abgewandelte Version vom Glückrad, damit das Spiel auf jedem Gerät im Webbrowsser gespielt werden kann. |

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  | 1) Der Administrator mit dem Benutzername "Zhanyi Xiong" mit dem Passwort "Zhanyi123" ist in der Datenbank vorhanden. <br> 2) Die Seite index.html vom Glücksrad Spiel ist geöffnet. | 1) Klicken Sie auf Administrator. <br> 2) Tragen sie bei Username «Zhanyi Xiong» ein. <br> 3) Tragen sie bei Passwort «Zhanyi123» ein. <br> 4) Klicken Sie auf «Login». | 1) Sie werden Seite Category.html weitergeleitet. |
| 2.1  | 1) Der Administrator mit dem Benutzername "Zhanyi Xiong" mit dem Passwort "Zhanyi123" ist in der Datenbank vorhanden. <br> 2) Die Seite index.html vom Glücksrad Spiel ist geöffnet. | 1) Klicken Sie auf Administrator. <br> 2) Tragen sie bei Username «Zhanyi Xiong» ein. <br> 3) Tragen sie bei Passwort «Zhanyi123» ein. <br> 4) Klicken Sie auf «Login». | 1) Sie werden Seite Category.html weitergeleitet. |
| 3.1 |1. Sie haben sich erfolgreich als Administrator authentifiziert. <br> 2. Die Seite category.html ist geöffnet. <br> 3. In der Datenbank befindet sich die Category «countries». | 1. Sie klicken auf Delete, welches sich in der gleichen Zeile wie «countries» befindet. | 1. Die Zeile mit «countries» verschwindet. | 
| 3.2 | 1. Sie haben sich erfolgreich als Administrator authentifiziert. <br> 2. Die Seite category.html ist geöffnet. <br> 3. Sie klicken in der Zeile mit «countries» auf Edit. <br> 4. Sie wurden auf die Seite puzzleWord.html weitergeleitet. <br>5. In der Liste sehen Sie den Eintrag «Switzerland» | 1. Sie klicken auf Delete, welches sich in der gleichen Zeile wie «Switzerland» befindet. | 1. Die Zeile mit «Switzerland» verschwindet. |
| 4.1 | 1. Sie haben sich erfolgreich als Administrator authentifiziert. <br> 2. Die Seite category.html ist geöffnet. <br> 3. Sie klicken in der Zeile mit «countries» auf Edit. <br> 4. Sie wurden auf die Seite puzzleWord.html weitergeleitet. | 1. Oben Rechts befindet sich ein Button «Add PuzzleWord» <br> 2. Sie werden auf die Seite addPuzzleWord.html weitergeleitet. <br> 3. Sie gaben bei Puzzleword «Switzerland» ein. <br> 4. Sie klicken auf Add Puzzleword. | 1. Sie werden auf die Seite puzzleWord.html zurückgeleitet. <br> 2. Sie können in der Tabelle unter der Spalte PuzzleWord «Switzerland» sehen. |
| 5.1 | 1. Sie haben sich erfolgreich als Administrator authentifiziert. <br> 2. Die Seite category.html ist geöffnet. |1. Oben Rechts befindet sich ein Button «Add Category» <br> 2. Sie werden auf die Seite addCategory.html weitergeleitet. <br> 3. Sie gaben bei Category Name «countries» ein. <br> 4. Sie klicken auf Add Category. | 1. Sie werden auf die Seite category.html zurückgeleitet. <br> 2. Sie können in der Tabelle unter der Spalte Category Name «countries» sehen. |
| 6.1 | 1. Sie haben sich erfolgreich als Administrator authentifiziert. <br> 2. Die Seite category.html ist geöffnet. <br> 3. Es gibt einen Highscore mit dem Username «Zhanyi» | 1. Oben Link finden Sie den Button «Edit Highscorelist» <br> 2, Sie werden auf die Seite editHighscoreList.html weitergeleitet. <br> 3. In der Liste klicken Sie auf den Delete Button, welche sich in der Zeile mit dem Username «Zhanyi» befindet. | 1. Der Eintrag in der List mit dem Username «Zhanyi» verschwindet. |
| 7.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel | 1. Sie klicken auf den Butten «Highscore» | 1. Sie werden auf die Seite highscore.htmlWeitergeleitet und sehen eine Liste mit Rank, Username, Date, Balance und Rounds sehen. |
| 8.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. <br> 3. Sie haben auf Play gedrückt. | 1. Sie geben auf den Button Aufgeben. | 1. Sie werden zurück auf die Index.html Seite geleitet. <br> 2. Sie sehen auf der Highscore.html Seite Ihr name mit Balance 1000. |
| 9.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. <br> 3. Sie haben auf Play gedrückt. |1. Sie geben auf den Button Aufgeben. | 1. Sie werden zurück auf die Index.html Seite geleitet. <br> 2. Sie sehen auf der Highscore.html Seite Ihr name mit Balance 1000. |
| 10.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. | 1. Sie drücken den Button Play. | 1. Auf der Linken Seite sehen sie «Balance:» und «1000» |
| 11.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. | 1. Sie drücken den Button Play. | 1. Auf der Linken Seite sehen sie «Hearts:» mit der Zahl «3» |
| 12.1 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. <br> 3. Sie haben auf den Button «Play» gedrückt. <br> 4. Ihnen wurde die Category «Idiom» zugewiesen. <br> 5. Ihnen wurde die PuzzleWord «Better late than never» zugewiesen. <br> 6. Sie haben das Glücksrad gedreht und bekommen nicht die Ausgabe «BAnkkrott». | 1. Sie geben im Inputfeld oberhalb von Button «Guess» «N» ein. <br> 2. Sie Drücken auf Guess. | 1. Sie bekommen die Meldung «Richtig» |
| 12.2 | 1. Sie befinden sich auf der index.html Seite vom Spiel <br> 2. Sie haben geben «Zhanyi» bei Username ein. <br> 3. Sie haben auf den Button «Play» gedrückt. <br> 4. Ihnen wurde die Category «Idiom» zugewiesen. <br> 5. Ihnen wurde die PuzzleWord «Better late than never» zugewiesen. <br> 6. Sie haben das Glücksrad gedreht und bekommen nicht die Ausgabe «Bankkrott». | 1. Sie geben im Inputfeld oberhalb von Button «Guess» «Y» ein. <br> 2. Sie Drücken auf Guess. | 1. Sie bekommen die Meldung «Falsch» |
| 13.1 | 1. Sie befinden sich auf der index.html Seite des Spiels. <br> 2. In der Datenbank gibt es den Player: <br> Username: «Zhanyi» <br> Balance: «2000» <br> Username: «Ramias» <br> Balance: «1100» <br> Username: «Anna» <br> Balance: «1500» | 1. Sie klicken auf den Button «Highscore» | 1. Sie sehen eine Liste in der ersten Zeile ist «Zhanyi» <br> 2. In der zweiten Zeile sehen Sie «Anna» <br> 3. In der dritten Zeile sehen Sie «Ramias» |

# 5 Prototyp

Index.html
![index](https://user-images.githubusercontent.com/94226346/213975538-d5f81209-1e64-4004-a6e4-31fc61e9e795.jpg)
Slotgame.html
![Slotgame1](https://user-images.githubusercontent.com/94226346/213975606-85fbf24f-2b25-4543-842c-0065e687f696.jpg)
![Slotgame2](https://user-images.githubusercontent.com/94226346/213975617-79a3533d-b1ba-4037-a506-25a2e8486d61.jpg)
Highscore.html
![Highscore](https://user-images.githubusercontent.com/94226346/213975626-a6a8b87d-8a81-4ff8-bab4-98ca250d072e.jpg)
Login.html
![Login](https://user-images.githubusercontent.com/94226346/213975659-2d247675-192e-444d-b72b-f50ee14eec57.jpg)
Category.html
![Category](https://user-images.githubusercontent.com/94226346/213975682-019ff60e-5624-4b81-948d-af9a633e5dba.jpg)
![Puzzleword](https://user-images.githubusercontent.com/94226346/213975698-3df9f62b-8442-4083-839e-ef3cbfdf9aa8.jpg)

# 6 Implementation

✍️ Halten Sie fest, wann Sie welche User Story bearbeitet haben

| User Story | Datum | Beschreibung |
| ---------- | ----- | ------------ |
| 1 | 20.02.2023 | Administrator Authentification. |
| 3 | 20.02.2023 | Phrasen und Räselwörter editieren/löschen. |
| 5 | 20.02.2023 | Phrasen und Räselwörter sind einer Kategory zugeordnet. |
| 6 | 20.02.2023 | Einträge in HighscoreListe löschen. |
| 7 | 20.02.2023 | Einträge von HighscoreList anzeigen. |
| 9 | 20.02.2023 | Username eingeben. |
| 10 | 20.02.2023 | Kontostand wird angezeigt. |
| 11 | 20.02.2023 | Lebenpunkte werden angezeigt. |
| 17 | 20.02.2023 | Spiel findet im Webbrowser statt. |

# 7 Projektdokumentation

| US-№ | Erledigt? | Entsprechende Code-Dateien oder Erklärung |
| ---- | --------- | ----------------------------------------- |
| 1 | ja | login.xhtml <br> loginController.java Zeile 20-27 <br> AdministratorDAO.java Zeile 32-49|
| 3 | ja | puzzleWordEdit.xhtml <br> categoryEdit.xhtml <br> EditCategoryController.java <br> EditPuzzleWordController.java <br> FortuneWheelDAO.java Zeile: 84-89 |
| 5 | ja | PuzzleWord.java Zeile: 16-20 |
| 6 | ja | highscoreAdmin.xhtml Zeile: 30 |
| 7 | ja | highscore.xhtml Zeile: 16-29 |
| 9 | ja | index.xhtml Zeile: 17-18 |
| 10 | ja | fortuneWheel.xhtml Zeile 21 |
| 11 | ja | fortuneWheel.xhtml Zeile: 19 |
| 17 | ja | fortuneWheel.xhtml |


# 8 Testprotokoll

https://youtu.be/BCgZaWvPQWI UserStory: 1, 3
https://youtu.be/-QEPGSTjmxw UserStory: 7
https://www.youtube.com/watch?v=ZpSMhH076hg UserStory: 3, 5
https://youtu.be/OcA7Fcy8bOs UserStory: 4
https://youtu.be/-nKxFNSh9s0 UserStory: 9, 10, 11, 17
https://youtu.be/RfR8vZ4luUo UserStory: 6, 7



| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  | 27.02.2023 | OK | Zhanyi Xiong |
| 3.1  | 27.02.2023 | OK | Zhanyi Xiong |
| 5.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 6.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 7.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 9.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 10.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 11.1 | 27.02.2023 | OK | Zhanyi Xiong |
| 17.1 | 27.02.2023 | OK | Zhanyi Xiong |

Fazit:
Die Admin Funktionen sind grösstenteils Implementiert, es gibt noch einige Fehler.
Das Spiel funktioniert überhaupt nicht, es passiert nichts wenn man auf den Guess Button Klickt. 

# 9 `README.md`

✍️ Beschreiben Sie ausführlich in einer README.md, wie Ihre Applikation gestartet und ausgeführt wird. Legen Sie eine geeignete Möglichkeit (Skript, Export, …) bei, Ihre Datenbank wiederherzustellen.

# 10 Allgemeines

- [ ] Ich habe die Rechtschreibung überprüft
- [ ] Ich habe überprüft, dass die Nummerierung von Testfällen und User Stories übereinstimmen
- [ ] Ich habe alle mit ✍️ markierten Teile ersetzt
