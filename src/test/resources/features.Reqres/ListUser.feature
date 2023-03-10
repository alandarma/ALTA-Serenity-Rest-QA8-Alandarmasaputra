Feature: Testing List Users Reqres API
  @Latihan
  Scenario Outline: Get list users with valid parameter page reqres API
    Given Get list user with page <page>
    When Send request get list user
    Then Should return status code 200
    And Response body page should be <page>
    And Validate json schema list user
    Examples:
      |page|
      |1   |
      |2   |
  @Tugas @NegativeCase
  Scenario Outline: Get list users with invalid parameter page reqres API
    Given Get list user with page "<page>"
    When Send request get list user
    Then Should return status code 400
    Examples:
      |page     |
      |%^*      |
      |abcjet   |

  #Silahkan tambahkan skenario negatif case dll

  @Tugas
  Scenario: Get list Users with invalid special character
    Given Get list user with invalid special character
    When Send request get list user
    Then should return status code 200
    And Response body page should be <page>
    And Validate json schema list user