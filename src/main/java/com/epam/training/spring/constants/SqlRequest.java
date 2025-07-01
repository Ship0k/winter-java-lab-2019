package com.epam.training.spring.constants;

public class SqlRequest {
    public static final String SHOW_SPECTACLES = "select PerformanceID id, Play_Title playTitle, " +
            "Author authorName, Premiere premiere, concat(FirstName, ' ', LastName) directorName, Genre_Title genre " +
            "from performances pf " +
            "join Plays p on pf.PlayID = p.PlayID " +
            "join Genres g on p.GenreID = g.GenreID " +
            "join Directors d on pf.DirectorID = d.DirectorID " +
            "order by premiere";

    public static final String SHOW_ACTORS_OF_THE_PERFORMANCE = "select a.ActorID id, Amplois_Title role, " +
            "Sex gender, concat(FirstName, ' ', LastName) name, Rank_Title rank " +
            "from employment e " +
            "join Actors a on e.ActorID = a.ActorID " +
            "join Ranks r on a.RankID = r.RankID " +
            "join Amplois am on e.AmploisID = am.AmploisID " +
            "where PerformanceID = ?";

    public static final String SHOW_GENRES = "select * from Genres";

    public static final String SHOW_DIRECTORS ="select DirectorID id, concat(FirstName, ' ', LastName) name " +
            "from Directors";

    public static final String SHOW_ACTORS = "select ActorID id, concat(FirstName, ' ', LastName) name, Sex gender " +
            "from Actors";

    public static final String SHOW_AMPLIOS = "select AmploisID id, Amplois_Title title from Amplois";

    public static final String ADD_PlAYS = "insert into Plays (Play_Title, Author, GenreID, Release_Date) " +
            "VALUES (?, ?, ?, ?);";

    public static final String GET_PLAY_ID = "select PlayID id from Plays where Play_Title = ?;";

    public static final String ADD_PERFORMANCES = "INSERT INTO Performances (PlayID, DirectorID, Premiere) " +
            "VALUES (?, ?, ?);";

    public static final String ADD_AMPLOIS = "insert into Amplois (Amplois_Title) values (?);";

    public static final String GET_AMPLOIS_ID = "select AmploisID id from Amplois where Amplois_Title = ?;";

    public static final String GET_PERFORMANCE_ID = "select PerformanceID id from Performances where PlayID = ?;";

    public static final String ADD_EMPLOYMENTS = "INSERT INTO Employment (ActorID, AmploisID, PerformanceID, Budget) " +
            "VALUES (?, ?, ?, ?);";
}