-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 27. Feb 2023 um 06:38
-- Server-Version: 10.4.24-MariaDB
-- PHP-Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `fortunewheelgame`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `administrator`
--

CREATE TABLE `administrator` (
  `administrator_Id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `administrator`
--

INSERT INTO `administrator` (`administrator_Id`, `username`, `password`) VALUES
(1, 'Zhanyi', 'Zhanyi123');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `category`
--

CREATE TABLE `category` (
  `category_Id` int(11) NOT NULL,
  `categoryName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `category`
--

INSERT INTO `category` (`category_Id`, `categoryName`) VALUES
(1, 'Tiere'),
(2, 'Idiom');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `highscore`
--

CREATE TABLE `highscore` (
  `highscore_Id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `moneyBalance` int(11) NOT NULL,
  `numberOfRounds` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `highscore`
--

INSERT INTO `highscore` (`highscore_Id`, `name`, `date`, `moneyBalance`, `numberOfRounds`) VALUES
(1, 'Zhanyi', '2023-02-26', 2000, 2),
(2, 'Ramias', '2023-02-26', 1100, 3),
(3, 'Anna', '2023-02-26', 1500, 4);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `puzzleword`
--

CREATE TABLE `puzzleword` (
  `puzzleWord_Id` int(11) NOT NULL,
  `category_Id` int(11) NOT NULL,
  `puzzleWord` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `puzzleword`
--

INSERT INTO `puzzleword` (`puzzleWord_Id`, `category_Id`, `puzzleWord`) VALUES
(1, 1, 'Blauwal'),
(2, 1, 'Affe'),
(3, 2, 'Better late than never'),
(4, 2, 'Bite the bullet');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`administrator_Id`);

--
-- Indizes für die Tabelle `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_Id`);

--
-- Indizes für die Tabelle `highscore`
--
ALTER TABLE `highscore`
  ADD PRIMARY KEY (`highscore_Id`);

--
-- Indizes für die Tabelle `puzzleword`
--
ALTER TABLE `puzzleword`
  ADD PRIMARY KEY (`puzzleWord_Id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `administrator`
--
ALTER TABLE `administrator`
  MODIFY `administrator_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT für Tabelle `category`
--
ALTER TABLE `category`
  MODIFY `category_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT für Tabelle `highscore`
--
ALTER TABLE `highscore`
  MODIFY `highscore_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `puzzleword`
--
ALTER TABLE `puzzleword`
  MODIFY `puzzleWord_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
