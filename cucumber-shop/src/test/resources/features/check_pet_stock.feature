Feature: Buy pets with stock condition

Background:
    Given My pet shop has Dog with quantity 10 and 5000 for each.

Scenario: Enough to buy
    When Pet-I bought Dog with quantity 2
    Then must have 8 in stock:get 10000

Scenario: Out off stock
    When Pet-I bought Dog with quantity 20
    Then We don't have enough-stock still 10

