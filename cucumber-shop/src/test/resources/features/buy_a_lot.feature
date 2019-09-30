Feature: Buy a lot of pets

Background:
    Given Pet Shop sells
        | Dog   | 5000  |
        | Cat   | 2000  |
        | Snake | 500   |
        | Alpaca| 10000 |

Scenario: Buy multiple pets
    When I bought Dog with quantity 1
    And I bought Alpaca with quantity 1
    Then total should be 15000