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
        <h1>Actors of the spectacle "${playName}"</h1>
    </div>
    <div class="menu_link">
        <a class="link" href="/user/spectacles">BACK TO PERFORMANCE</a>
    </div>
    <table class="table">
        <tr>
            <th>Role</th>
            <th>Gender</th>
            <th>Actor name</th>
        </tr>
        <#list actors as actor>
            <tr>
                <td>${actor.role}</td>
                <td>${actor.gender}</td>
                <td title="${actor.rank}">${actor.name}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>