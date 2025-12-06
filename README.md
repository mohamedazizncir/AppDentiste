# :tooth: SmileEveryday - Plateforme de Gestion Dentaire

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-9.1-000000?style=for-the-badge&logo=jakartaee&logoColor=white)
![WildFly](https://img.shields.io/badge/WildFly-27+-1A237E?style=for-the-badge&logo=jboss&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-005C84?style=for-the-badge&logo=mysql&logoColor=white)

> **Projet Académique - ENIT 2025-2026**
> **Module :** Technologie JEE
> **Sujet :** Système de prise de rendez-vous et gestion de cabinet dentaire.

## :memo: Description

**SmileEveryday** est une application web complète basée sur l'architecture **Jakarta EE (J2EE)**. Elle permet de digitaliser le processus de prise de rendez-vous pour les patients et la gestion des actes médicaux pour les dentistes.

Le projet met en œuvre une architecture **MVC** stricte :
* **Modèle** : Entités JPA (Hibernate) mappées sur une base MySQL.
* **Contrôleur** : Servlets et EJBs (Enterprise JavaBeans) pour la logique métier.
* **Vue** : Pages JSP (JavaServer Pages) avec JSTL.

## :building_construction: Architecture & Technologies

* **Langage :** Java (JDK 11 ou 17 recommandé).
* **Serveur d'Application :** WildFly (JBoss).
* **Base de Données :** MySQL 8.
* **ORM :** JPA 3.0 (Hibernate).
* **Build Tool :** Maven.
* **IDE :** IntelliJ IDEA Ultimate.

### Schéma de Données
L'application génère automatiquement les tables suivantes :
* `Patient` : Informations et authentification des patients.
* `Dentiste` : Médecins et spécialistes.
* `ServiceMedical` : Catalogue des soins (ex: Détartrage, Chirurgie).
* `Rendezvous` : Gestion des créneaux horaires.
* `ActeMedical` : Table de liaison pour la facturation des actes par RDV.

---

## :gear: Installation et Démarrage

Suivez ces étapes pour déployer le projet localement.

### 1. Base de Données
Créez une base de données vide dans MySQL :
```sql
CREATE DATABASE dental_db;
