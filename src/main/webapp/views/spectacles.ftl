<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theater</title>
    <link rel="shortcut icon" href="/resources/images/logo.png" type="image/png">
    <link rel="stylesheet" href="/resources/css/styles.css">
</head>
<body>
<div class="container">
    <div class="title">
        <h1>Spectacles</h1>
    </div>
    <div class="menu_link">
        <a class="link" href="/">TO HOME PAGE</a>
    </div>
    <table class="table">
        <tr>
            <th>Play</th>
            <th>Author</th>
            <th>Premiere</th>
            <th>Director</th>
            <th></th>
        </tr>
        <#list spectacles as spectacle>
            <tr>
                <td title="${spectacle.genre}">${spectacle.playTitle}</td>
                <td>${spectacle.authorName}</td>
                <td>${spectacle.premiere?date?string("dd.MM.yyyy")}</td>
                <td>${spectacle.directorName}</td>
                <td>
                    <a class="link" href="/user/actors/${spectacle.idSpectacle}/${spectacle.playTitle}">
                        acting group
                    </a>
                </td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>