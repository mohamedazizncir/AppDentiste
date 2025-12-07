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
    <h1>Prendre un rendez-vous</h1>

    <form action="RendezvousServlet" method="post">
        <label>Patient ID</label>
        <input type="number" name="patientId" placeholder="Saisir votre ID patient" required>

        <label>Date du rendez-vous</label>
        <input type="date" name="dateRV" required>

        <label>Heure du rendez-vous</label>
        <input type="time" name="heureRV" required>

        <label>Service</label>
        <select name="serviceRV" required>
            <option value="">[Choisir]</option>
            <option value="Consultation">Consultation</option>
            <option value="Nettoyage">Nettoyage</option>
            <option value="Extraction">Extraction</option>
            <option value="Orthodontie">Orthodontie</option>
        </select>

        <div style="text-align: center;">
            <button type="submit">Prendre rendez-vous</button>
            <button type="reset" style="background-color: #d9534f;">Annuler</button>
        </div>
    </form>
</div>

<jsp:include page="inc/footer.jsp" />
</body>
</html>