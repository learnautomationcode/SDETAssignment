Feature: This is to understand scenario outline

  Scenario Outline: Addition
    Given I have two number <number1> and <number2>
    When I add those two number
    Then I should get the value as <result>

    @test
    Examples: 
      | number1 | number2 | result |
      |       3 |       5 |      8 |
      |       4 |       5 |      9 |
      |       7 |       5 |      9 |
      |      10 |       5 |     15 |
      |       3 |       5 |      8 |

    @stage
    Examples: 
      | number1 | number2 | result |
      |       7 |       5 |     12 |
      |       4 |       5 |      9 |
      |       7 |       5 |     12 |
      |      10 |       5 |     15 |
      |       3 |       5 |      8 |
