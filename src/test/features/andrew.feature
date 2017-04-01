@my
  Feature: Some basic checks

    Scenario: Search for Sara
      Given the app is running
      When searching for Sara
      Then Sara Alston is returned