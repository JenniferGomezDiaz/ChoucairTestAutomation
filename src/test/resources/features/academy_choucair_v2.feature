#
# Autor: Jennifer Gomez
# 28/10/2021
#
  @stories
  Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at Choucair with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Rose want to learn automation at the academy Choucair
    | strUser    | strPassword     |
    | 1062311462 | Chouplus#320522 |
    When she search for the course on the Choucair Academy platform
    | strCourse               |
    | Metodología Bancolombia |
    Then she finds the course called
    | strCourse               |
    | Metodología Bancolombia |