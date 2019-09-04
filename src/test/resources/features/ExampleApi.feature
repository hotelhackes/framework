Feature: ExampleApi

  Scenario: Example API
    Given I search for Max Verstappen on the drivers endpoint of the Ergast API
    Then I expect a result containing Dutch
