CREATE TABLE Genres (
GenreID int PRIMARY KEY AUTO_INCREMENT,
Genre_Title varchar(30) NOT NULL
);
INSERT INTO Genres (Genre_Title)
VALUES ('Vaudeville'), ('Comedy'), ('Drama'), ('Melodrama'), ('Fairy tale');

CREATE TABLE Plays (
PlayID int PRIMARY KEY AUTO_INCREMENT,
Play_Title varchar(60) NOT NULL UNIQUE,
Author varchar(30) NOT NULL,
GenreID int NOT NULL,
Release_Date date NOT NULL,
FOREIGN KEY(GenreID) REFERENCES Genres (GenreID)
);
INSERT INTO Plays (Play_Title, Author, GenreID, Release_Date)
VALUES ('Miller - sorcerer, trickster and matchmaker', 'Ablesimov A.O.', 1, '1779-01-20'),
('New Year of Private Gleb Sazonov', 'Abramtsev K.', 4, '2000-02-11'),
('Michel', 'Azernikov V.', 2, '2005-05-21'),
('Bamboo island', 'Bogacheva A.', 5, '1966-11-20'),
('Homecoming', 'Pinter G.', 3, '1964-09-25');

CREATE TABLE Directors (
DirectorID int PRIMARY KEY AUTO_INCREMENT,
FirstName varchar(15) NOT NULL,
Patronymic varchar(15) NOT NULL,
LastName varchar(15) NOT NULL
);
INSERT INTO Directors (FirstName, Patronymic, LastName)
VALUES ('Yuri', 'Nikolaevich', 'Zenkov'),
('Gleb', 'Olegovich', 'Tarasov'),
('Stanislav', 'Sergeevich', 'Paraev'),
('Sergey', 'Sergeevich', 'Lapeko'),
('Dmitri', 'Alexeevich', 'Smirnov');

CREATE TABLE Performances (
PerformanceID int PRIMARY KEY AUTO_INCREMENT,
PlayID int NOT NULL,
DirectorID int NOT NULL,
Premiere date NOT NULL,
FOREIGN KEY(PlayID) REFERENCES Plays (PlayID),
FOREIGN KEY(DirectorID) REFERENCES Directors (DirectorID)
);
INSERT INTO Performances (PlayID, DirectorID, Premiere)
VALUES (3, 1, '2020-01-17'),
(2, 2, '2020-02-08'),
(5, 4, '2020-02-22'),
(4, 3, '2020-03-07'),
(1, 1, '2020-03-14');

CREATE TABLE Ranks (
RankID int PRIMARY KEY AUTO_INCREMENT,
Rank_Title varchar(45) NOT NULL
);
INSERT INTO Ranks (Rank_Title)
VALUES ('Peoples Artist of Belarus'), ('Honored Artist of the Republic of Belarus'), ('Artist');

CREATE TABLE Actors (
ActorID int PRIMARY KEY AUTO_INCREMENT,
FirstName varchar(25) NOT NULL,
Patronymic varchar(25) NOT NULL,
LastName varchar(25) NOT NULL,
Sex varchar(6) NOT NULL,
Birthday date NOT NULL,
RankID int NOT NULL,
FOREIGN KEY(RankID) REFERENCES Ranks (RankID)
);

INSERT INTO Actors (FirstName, Patronymic, LastName, Sex, Birthday, RankID)
VALUES ('Alla', 'Mikhailovna', 'Lenaya', 'female', '1980-12-24', 1),
('Yuri', 'Semenovich', 'Martinovich', 'male', '1969-08-09', 1),
('Tatiana', 'Nikolaevna', 'Kondratenko', 'female', '1985-03-15', 2),
('Pavel', 'Vladimirovich', 'Kordik', 'male', '1981-06-24', 1),
('Andrey', 'Petrovich', 'Shidlovsky', 'male', '1985-04-20', 2),
('Dmitry', 'Valerevich', 'Baykov', 'male', '1983-05-13', 2),
('Mikhail', 'Alexsandrovich', 'Grishechkin', 'male', '1990-10-16', 3),
('Irina', 'Vladimirovna', 'Kublitscaya', 'female', '1993-11-09', 3);

CREATE TABLE Amplois (
AmploisID int PRIMARY KEY AUTO_INCREMENT,
Amplois_Title varchar(50) NOT NULL UNIQUE
);
INSERT INTO Amplois (Amplois_Title)
VALUES ('Girl'), ('Young man'), 
('Magician'), ('Soldier'), ('Student'), ('Passersby'), ('Man on duty'), ('Chief'),
('Man'), ('Woman'),
('Peasant'), ('Groom'), ('Miller'),
('Mother'), ('Turtle'), ('Monkey'), ('Dragon'), ('Rabbit');

CREATE TABLE Employment (
EmploymentID int PRIMARY KEY AUTO_INCREMENT,
ActorID int NOT NULL,
AmploisID int NOT NULL,
PerformanceID int NOT NULL,
Budget int NOT NULL,
FOREIGN KEY(ActorID) REFERENCES Actors (ActorID),
FOREIGN KEY(AmploisID) REFERENCES Amplois (AmploisID),
FOREIGN KEY(PerformanceID) REFERENCES Performances (PerformanceID)
);
INSERT INTO Employment (ActorID, AmploisID, PerformanceID, Budget)
VALUES (3, 1, 1, 500), (8, 1, 1, 500), (6, 2, 1, 620), (7, 2, 1, 340),
(2, 3, 2, 320), (7, 4, 2, 530), (8, 5, 2, 450), (3, 1, 2, 450), (5, 5, 2, 400), (6, 6, 2, 200), (1, 7, 2, 510), (4, 8, 2, 310),
(2, 9, 3, 320), (4, 9, 3, 320), (5, 9, 3, 450), (6, 9, 3, 220), (7, 9, 3, 100), (3, 10, 3, 640),
(8, 1, 5, 400), (7, 12, 5, 420), (1, 10, 5, 300), (4, 11, 5, 390), (5, 13, 5, 570),
(7, 5, 4, 210), (5, 5, 4, 210), (3, 14, 4, 250), (1, 15, 4, 150), (8, 16, 4, 290), (2, 17, 4, 100), (6, 18, 4, 180);