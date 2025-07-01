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
        <h1>Enter login and password for access</h1>
    </div>
    <div class="menu_link">
        <a class="link" href="/">TO HOME PAGE</a>
    </div>
    <div class="form">
        <form action="/login" method="post">
            <div class="form_input">
                <input type="text" id="username" name="username" placeholder=" Login" required>
                <input type="password" id="password" name="password" placeholder=" Password" required>
            </div>
            <div class="form_button">
                <button class="perform">Login</button>
            </div>
        </form>
    </div>
    <div class="text">
        <h3>Help</h3>
        <p>
            Access for "SEE THE PLAYBILL" (login: user; password: user)<br>
            Full access (login: admin; password: admin)
        </p>
    </div>
</div>
</body>
</html>