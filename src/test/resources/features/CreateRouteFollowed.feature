Feature: Create RouteFollowed
  In order to use the app
  As a user
  I must be able to create RouteFollowed

  Background:
    Given There is a registered user with username "user" and password "password" and email "user@sample.app"
    Given There is a route with a title "testRoute", description "route description", type "Running" and a creationDate "2023-10-25T17:27:00Z" by user username "user"

  Scenario: Create a new RouteFollowed while logged in
    Given I login as "user" with password "password"
    When I create a routeFollowed with date "2023-11-01T15:45:00Z", duration "P1DT1H10M10.5S", levelUp "40" and a levelDown "10"
    Then The response code is 201