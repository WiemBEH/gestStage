-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Dim 02 Avril 2017 à 16:53
-- Version du serveur :  10.1.9-MariaDB
-- Version de PHP :  5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `geststage`
--

-- --------------------------------------------------------

--
-- Structure de la table `candidature`
--

CREATE TABLE `candidature` (
  `cid` int(10) NOT NULL,
  `eeid` int(11) NOT NULL,
  `eid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `reponse` enum('refus','acceptation') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `candidature`
--

INSERT INTO `candidature` (`cid`, `eeid`, `eid`, `sid`, `reponse`) VALUES
(1, 18, 4, 2, 'refus'),
(2, 18, 2, 4, 'acceptation'),
(3, 2, 2, 8, 'acceptation');

-- --------------------------------------------------------

--
-- Structure de la table `domaine`
--

CREATE TABLE `domaine` (
  `did` int(10) NOT NULL,
  `nom` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `domaine`
--

INSERT INTO `domaine` (`did`, `nom`) VALUES
(2, 'developpement'),
(3, 'RH'),
(4, 'administration');

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE `entreprise` (
  `eeid` int(10) NOT NULL,
  `nomEntreprise` varchar(50) NOT NULL,
  `adresseEntreprise` varchar(30) NOT NULL,
  `codePostaleEntreprise` int(11) NOT NULL,
  `villeEntreprise` varchar(30) NOT NULL,
  `emailEntreprise` varchar(30) NOT NULL,
  `telEntreprise` int(15) NOT NULL,
  `secteurEntreprise` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `eid` int(10) NOT NULL,
  `nomEtudiant` varchar(30) NOT NULL,
  `prenomEtudiant` varchar(30) NOT NULL,
  `emailEtudiant` varchar(30) NOT NULL,
  `did` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`eid`, `nomEtudiant`, `prenomEtudiant`, `emailEtudiant`, `did`) VALUES
(1, 'montassar', 'chihaoui', 'monta@gmail.com', 1),
(2, 'mohamed', 'naguez', 'med@gmail.com', 1),
(4, 'test_et', 'naguez', 'med@gmail.com', 4);

-- --------------------------------------------------------

--
-- Structure de la table `stage`
--

CREATE TABLE `stage` (
  `sid` int(30) NOT NULL,
  `eeid` int(35) NOT NULL,
  `nomEntreprise` varchar(255) NOT NULL,
  `libelleEntreprise` varchar(200) NOT NULL,
  `descriptionOffre` text NOT NULL,
  `dateDebutOffre` date NOT NULL,
  `dureeOffre` int(11) NOT NULL,
  `cheminOffre` varchar(254) NOT NULL,
  `domaine` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(30) NOT NULL,
  `login` varchar(255) NOT NULL,
  `mdp` varchar(250) NOT NULL,
  `typeUser` enum('Etudiant','Admin','Entreprise','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `candidature`
--
ALTER TABLE `candidature`
  ADD PRIMARY KEY (`cid`);

--
-- Index pour la table `domaine`
--
ALTER TABLE `domaine`
  ADD PRIMARY KEY (`did`);

--
-- Index pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`eeid`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`eid`);

--
-- Index pour la table `stage`
--
ALTER TABLE `stage`
  ADD PRIMARY KEY (`sid`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `candidature`
--
ALTER TABLE `candidature`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `domaine`
--
ALTER TABLE `domaine`
  MODIFY `did` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `entreprise`
--
ALTER TABLE `entreprise`
  MODIFY `eeid` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `eid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `stage`
--
ALTER TABLE `stage`
  MODIFY `sid` int(30) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
