Feature: Find Owners

  Background:
    Given The user launches the website

    Scenario: User should be able to add a new owner, and add pet a for that owner

      Given  The user is on find owners page

      When The user clicks on add owner

      And The user fills the owners details
        |First Name|Alaa|
        |Last Name|Bata|
        |Address|Tila Al Ali, Amman, Jordan|
        |City   |Amman|
        |Telephone|6085543163|

      And The user clicks submit

      Then The owner "Alaa Bata" should be added successfully with the correct Information
        |Address|Tila Al Ali, Amman, Jordan|
        |City   |Amman|
        |Telephone|6085543163|

      Then The user clicks on add pet

      And The user fills the pet details
        |Name|MILO|
        |Birth Date|2020-11-05|
        |Type      |dog|

      And The user clicks submit


      Then The pet "MILO" should be added successfully with the correct Information
        |Birth Date|2020-11-05|
        |Type      |dog|



