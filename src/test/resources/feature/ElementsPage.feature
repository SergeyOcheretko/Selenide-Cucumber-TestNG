Feature: Elements Page

  Background: Open DemoQa main page
    Given Open DemoQa main page
    Then Verify that DemoQa page is opened
    Given Click on the "Elements" tab
    And Verify that "Elements" page is opened


  Scenario: Open Text box page
    Given Click on the "Text Box" button
    And Verify that "Text Box" page is displayed

  Scenario: Fill the Text box with correct data
      Given Click on the "Text Box" button
      And Type "Vasya" in the "Full Name" field
      And Type "qwerty@gmail.com" in the "name@example.com" field
      Then Type "Kharkov" in the Current Address textArea
      Then Click on "Submit" button
      And Verify that results is displayed


  Scenario: Open Radio Button page
    Given Click on the "Radio Button" button
    And Verify that "Radio Button" page is displayed


    Scenario: Choose Yes radio-button
      Given Click on the "Radio Button" button
      And Click on the "Yes" radio button
      And Verify that "Yes" radio button is chosen


  Scenario: Choose Impressive radio-button
    Given Click on the "Radio Button" button
    And Click on the "Impressive" radio button
    And Verify that "Impressive" radio button is chosen


    Scenario: Not clickable No radio button
      Given Click on the "Radio Button" button
      And Verify that No radio button isn't clickable
