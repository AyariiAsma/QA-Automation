@connexion
Feature: Autentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier 
  
  @cnx
  Scenario: Autentification - OrangeHRM
    Given Je me connect à l'application OrangeHRM
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers le compte admin
    
    
