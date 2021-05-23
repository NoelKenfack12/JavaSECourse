<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
    <%@ include file="menu.jsp" %>
    <div class="container">
        <p><c:out value="Message depuis la JSTL" /></p>
        
        <p>Bonjour à vous ... ${ auteur.nom } ${ auteur.prenom }</p>
        <p>${ auteur.actif ? 'Vous êtes très actif !' : 'Vous êtes inactif !' }</p>
        
        
        <c:forEach items="${ noms }" var="titre" varStatus="status">
		    <p>
		     N°<c:out value="${ status.count }" /> :
		     <c:out value="${ titre }" /> !
		    </p>
		</c:forEach>
		
		<ul>
	        <c:forEach var="utilisateur" items="${ auteurs }">
	            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
	        </c:forEach>
	    </ul> 
        
        
        
        <!--  p>Bonjour
		    <%
		    //String name = (String) request.getAttribute("name");
		    //out.println(name);
		    %>
		</p -->

        <!--  div>
        	<p>
			    <%
			        /*String heure = (String) request.getAttribute("heure");
			        if (heure.equals("jour")) {
			            out.println("Bonjour"); 
			        }
			        else {
			            out.println("Bonsoir");
			        }*/
			    %>
			</p>
			<p>
			    <%
			        /*for (int i = 0 ; i < 20 ; i++) {
			            out.println("Une nouvelle ligne !<br />");
			        }*/
			    %>
			</p>
        </div -->
        
    </div>
        
  
    </body>
</html>