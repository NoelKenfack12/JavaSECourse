<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body class="body">
    
        <%@ include file="menu.jsp" %>
	        <div class="container"> 
	        <p>Bienvenue sur mon site !</p>
	        <p>Comment vous vous appelez !?</p>
	        <form method="post" action="bonjour">
	            <label for="nom">Nom: </label>
	            <input type="text" name="nom" id="nom" />
	            <label for="prenom">Prenom: </label>
	            <input type="text" name="prenom" id="prenom" />
	            <input type="submit" />
	        </form>
        </div>
    </body>
</html>