Feature: Testing Create user Reqres API
  @Latihan
  Scenario: Post create new user with valid json
    Given Post create user with valid json
    When Send request post create user
    Then Should return status code 201
    And Response body name should be "alandarma" and job "QA Engineer"
    And Validate json schema create user

  #Silahkan tambahkan skenario negatif case dll

  @Tugas
  Scenario: Post Create new user with special character
    Given Post create user with special character
    When Send request post create user
    Then Should return status code 201
    And Response body name should be "alan.darma+" and job "QA Engineer"

  @Tugas
  Scenario: Post Create new user with numeric
    Given Post create user with numeric
    When Send request post create user
    Then Should return status code 201
    And Response body name should be "alandarma123" and job "QA Engineer"

  @Tugas
  Scenario: Post Create new user with invalid Json
    Given Post create user with invalid Json
    When Send request post create user
    Then Should return status code 404

  @Tugas
  Scenario: Post Create new user with no content
    Given Post create user with no content
    When Send request post create user
    Then Should return status code 404