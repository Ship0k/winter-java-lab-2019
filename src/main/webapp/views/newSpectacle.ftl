<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theater</title>
    <link rel="shortcut icon" href="/resources/images/logo.png" type="image/png">
    <link rel="stylesheet" href="/resources/css/styles.css">
    <script src="/resources/js/new_spectacle.js"></script>
</head>
<body>
<div class="container">
    <div class="title">
        <h1>Creation of a new performance</h1>
    </div>
    <div class="menu_link">
        <a class="link" href="/">TO HOME PAGE</a>
    </div>
    <div class="form">
        <form name="newSpectacle" action="/admin/new-spectacle" method="post">
            <div class="performance">
                <h1>Add performance</h1>
                <input title="playTitle" type="text" name="playTitle" placeholder=" Play title" pattern="^[a-zA-Z0-9\s]+$" required>
                <input title="author" type="text" name="author" placeholder=" Author full name" pattern="^[a-zA-Z\s]+$" required>
                <h3>Genre</h3>
                <select title="genre" name="genre">
                    <#list genres as genre>
                        <option value="${genre.id}">${genre.genreTitle}</option>
                    </#list>
                </select>
                <#assign currentDate = .now?date?string("yyyy-MM-dd")>
                <h3>Date of writing</h3>
                <input title="releaseDate" type="date" name="releaseDate" max="${currentDate}" required>
                <h3>Stage director</h3>
                <select title="director" name="director">
                    <#list directors as director>
                        <option value="${director.id}">${director.name}</option>
                    </#list>
                </select>
                <h3>Premiere date</h3>
                <input title="premiere" type="date" name="premiere" min="${currentDate}" required>
            </div>

            <div class="actors">
                <h1>Add actors</h1>
                <div id="0">
                    <div id="1">
                        <h3>Actor</h3>
                        <select title="actor" name="actor">
                            <#list actors as actor>
                                <option value="${actor.id}">${actor.name} - ${actor.gender}</option>
                            </#list>
                        </select>
                        <input title="amploi" type="text" name="amploi" placeholder=" Role" list="amploiList"
                               pattern="^[a-zA-Z\s]+$" required>
                        <datalist id="amploiList">
                            <#list amplois as amploi>
                            <option value="${amploi.title}">
                                </#list>
                        </datalist>
                        <input title="budget" type="number" name="budget" placeholder=" Actor budget" min="100" required>
                    </div>
                </div>
            </div>
            <div class="form_button">
                <input type="button" title="add actor" class="add" value="+" onclick="addActor(); return false"/>
                <input type="submit" class="perform" value="OK">
            </div>
        </form>
    </div>
</div>
</body>
</html>