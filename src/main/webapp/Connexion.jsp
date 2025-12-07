<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Connexion</title>
  <link rel="stylesheet" type="text/css" href="css/mesStyles.css">
</head>
<body>
<jsp:include page="inc/header.jsp" />

<div class="container">
  <h2>Connexion</h2>

  <%
    // Récupère l'attribut d'erreur envoyé par AuthServlet
    String erreur = (String) request.getAttribute("erreurConnexion");
    if (erreur != null) {
  %>
  <p style="color: red; text-align: center; font-weight: bold;">
    <%= erreur %>
  </p>
  <%
    }
  %>
  <form action="AuthServlet" method="post">
    <label>Nom d'utilisateur (Email)</label>
    <input type="text" name="login" placeholder="Saisir votre nom d'utilisateur">

    <label>Mot de passe</label>
    <input type="password" name="password" placeholder="Saisir votre mot de passe">

    <div style="margin: 15px 0; text-align: center;">
      S'inscrire :
      <a href="Patient.jsp" style="color: blue;">Patient</a> |
      <a href="AideSoignant.jsp" style="color: blue;">Aide-soignant</a>
    </div>

    <button type="submit">Connexion</button>
    <button type="button">Annuler</button>
  </form>
</div>

<jsp:include page="inc/footer.jsp" />
</body>
</html>