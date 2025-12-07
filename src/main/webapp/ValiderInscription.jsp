
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inscription Patient</title>
    <link rel="stylesheet" type="text/css" href="css/mesStyles.css">
</head>
<body>
<jsp:include page="inc/header.jsp" />

<div class="container" style="text-align: center; color: green;">
    <h2>Inscription réussie !</h2>
    <p>Votre dossier médical a été créé avec succès.</p>
    <p>Consultez la liste des dentistes disponibles et prenez rendez-vous dès maintenant.</p>
    <a href="Rendezvous.jsp" class="btn">Prendre Rendez-vous</a>
</div>
<jsp:include page="inc/footer.jsp" />
</body>
</html>