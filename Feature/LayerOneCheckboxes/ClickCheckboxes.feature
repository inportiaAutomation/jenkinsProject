
@chk
Feature: Test the checkboxes

Background: 
* go to practice page 

@chk_01
Scenario: Click on given checkboxes exclusively
* select "BMW" checkbox
* select "BENZ" checkbox
* select "HONDA" checkbox


@chk_02
Scenario: Deselect on all checkbox
* deselect all the checkboxes
* close the browser


@chk_03
Scenario: Select only first and third
* deselect all the checkboxes
* select "BMW" checkbox
* select "HONDA" checkbox
* close the browser