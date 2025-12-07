<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inscription Patient</title>
    <link rel="stylesheet" type="text/css" href="css/mesStyles.css">
</head>
<body>
<jsp:include page="inc/header.jsp" />

<div class="container">
    <h1>Créer compte et Prenez rendez-vous en ligne</h1>

    <form action="PatientServlet" method="post">
        <label>Nom</label>
        <input type="text" name="nomP" placeholder="Saisir votre nom" required>

        <label>Prénom</label>
        <input type="text" name="prenomP" placeholder="Saisir votre prénom" required>

        <label>Adresse</label>
        <input type="text" name="adresseP" placeholder="Saisir votre adresse">

        <label>Téléphone</label>
        <input type="text" name="telP" placeholder="Saisir votre téléphone">

        <label>Email</label>
        <input type="email" name="emailP" placeholder="Saisir votre E-mail" required>

        <label>Mot de passe</label>
        <input type="password" name="mdpP" placeholder="Saisir votre mot de passe" required>

        <label>Date de naissance</label>
        <input type="date" name="dateNP">

        <label>Recouvrement</label>
        <select name="recouvrementP">
            <option value="">[Choisir]</option>
            <option value="CNAM">CNAM</option>
            <option value="Assurance Privée">Assurance Privée</option>
            <option value="Payant">Payant</option>
        </select>

        <div style="text-align: center;">
            <button type="submit">Enregistrer</button>
            <button type="reset" style="background-color: #d9534f;">Annuler</button>
        </div>
    </form>
</div>

<jsp:include page="inc/footer.jsp" />
</body>
</html>