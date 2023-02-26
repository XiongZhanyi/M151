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

✍️ Beschreiben Sie Ihr Projekt in einem griffigen Satz.

# 1 Analyse

✍️ Beschreiben Sie, auf welchem Tier Sie die dynamischen Elemente der Anwendung unterbringen möchten:

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

✍️ Beschreiben Sie für dieselben Tiers, welche Programmiersprache bzw. Technologie Sie verwenden möchten.
JSF, Java

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
| 6 | Muss | Funktional | Als ein Kanditat möchte ich Rang, Name des Spielers, Zeitpunkt des Spiels, Geldbetrag und Anzahl Spielrunden in der Hightscore-Liste sehen, damit ich mich mit anderen Spielern vergleichen kann und motiviert werde mich mit anderen Spielern zu messen. |
| 7 | Muss | Funktional | Als ein Kanditat möchte ich jederzeit aufhören können, damit mein Geldbetrag in die Highscore Liste übernommen wird. |
| 8 | Muss | Funktional | Als ein Kanditat möchte ich einen Namen angeben können, damit ich mich mit anderen Spielern messen kann. |
| 9 | Muss | Qualität | Als ein Kanditat möchte ich zur jeder Zeit mein Kontostand sehen, damit ich motiviert werden einen möglichst hohen Geldbetrag zu erspielen. |
| 10 | Muss | Qualität | Als ein Kanditat möchte ich zur jeder Zeit meine Lebenpunkte sehen, damit ich weiss wie viele Vokale ich noch erkaufen kann. |
| 11 | Muss | Qualität | Als ein Kanditat möchte ich dass mir mitgeteilt wird ob meine Antwort richtig oder falsch war, damit ein Glücksgefühl bei einer richtigen Antwort ausgelöst wird. |
| 12 | Muss | Qualität | Als ein Kanditat möchte ich das die Highscore-Liste nach dem Geldbetrag absteigend sortiert wird, damit ich motiviert werde, so lange zu spielen, bis ich an der Spitze bin. |
| 13 | Muss | Qualität | Als ein Kanditat möchte ich, dass ein Rätselwort nur einmal gestellt wird, damit das Spiel nicht langweilig wird. |
| 14 | Muss | Qualität | Als ein Kanditat möchte ich, dass Benutzereingaben Clientseitig Überprüft wird, damit nicht jede Eingabe an den Server gesendet werden muss. |
| 15 | Muss | Qualität | Als ein Administrator möchte ich, dass Benutzereingaben Serverseitig Überprüft wird, damit im System keine Fehler auftauchen. |
| 16 | Muss | Randbedingung | Als ein Administrator möchte ich eine Webbrowserapplikation vom abgewandelte Version vom Glückrad, damit das Spiel auf jedem Gerät im Webbrowsser gespielt werden kann. |

✍️ Jede User Story hat eine ganzzahlige Nummer (1, 2, 3 etc. oder Zahl), eine Verbindlichkeit (Muss oder Kann?), und einen Typ (Funktional, Qualität, Rand). 

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  | 1) Der Administrator mit dem Benutzername "Zhanyi Xiong" mit dem Passwort "Zhanyi123" ist in der Datenbank vorhanden. <br> 2) Die Seite index.html vom Glücksrad Spiel ist geöffnet. | 1) Klicken Sie auf Administrator. <br> 2) Tragen sie bei Username «Zhanyi Xiong» ein. <br> 3) Tragen sie bei Passwort «Zhanyi123» ein. <br> 4) Klicken Sie auf «Login». | 1) Sie werden Seite Category.html weitergeleitet. |
| 2.1  | 1) Der Administrator mit dem Benutzername "Zhanyi Xiong" mit dem Passwort "Zhanyi123" ist in der Datenbank vorhanden. <br> 2) Die Seite index.html vom Glücksrad Spiel ist geöffnet. | 1) Klicken Sie auf Administrator. <br> 2) Tragen sie bei Username «Zhanyi Xiong» ein. <br> 3) Tragen sie bei Passwort «Zhanyi123» ein. <br> 4) Klicken Sie auf «Login». | 1) Sie werden Seite Category.html weitergeleitet. |
| .1  | 1) Der Administrator mit dem Benutzername "Zhanyi Xiong" mit dem Passwort "Zhanyi123" ist in der Datenbank vorhanden. <br> 2) Die Seite index.html vom Glücksrad Spiel ist geöffnet. | 1) Klicken Sie auf Administrator. <br> 2) Tragen sie bei Username «Zhanyi Xiong» ein. <br> 3) Tragen sie bei Passwort «Zhanyi123» ein. <br> 4) Klicken Sie auf «Login». | 1) Sie werden Seite Category.html weitergeleitet. |

✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

# 5 Prototyp

✍️ Erstellen Sie Prototypen für das GUI (Admin-Interface und Quiz-Seite).

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
