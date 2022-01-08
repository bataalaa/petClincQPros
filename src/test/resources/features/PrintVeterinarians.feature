Feature: Print Veterinarians

  Scenario: User should be able to view all the Veterinarians and print them

    Given  The user launches the website
    And  The user is on Veterinarians page

    Then All veterinarians should be displayed and printed
