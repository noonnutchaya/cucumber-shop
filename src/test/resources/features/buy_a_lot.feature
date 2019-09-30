Feature: Buy a lot of products

Background:
    Given เรามี
        | เตารีด   | 100    |
        | ตู้เย็น   | 1000   |

Scenario: buy 2 product
    When ฉันซื้อ ตู้เย็น with quantity 2
    And ฉันซื้อ เตารีด with quantity 2
    Then total should be 2200


