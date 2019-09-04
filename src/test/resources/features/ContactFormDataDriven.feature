Feature: ContactForm DataDriven

  Scenario Outline: Sending a filled in contact form should result is a success message (datadriven)
    Given I'm on the Polteq TestShop
    When I send a contact form
      | subject   | email address   | reference   | message   |
      | <subject> | <email address> | <reference> | <message> |
    Then I should get a confirmation that the contact form has been sent

    Examples:
      | subject   | email address   | reference  | message      |
      | Webmaster | tester@test.com | 0987654321 | Some message |
