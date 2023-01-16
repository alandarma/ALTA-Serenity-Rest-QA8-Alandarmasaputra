Feature: Testing Update user Reqres API
  @Latihan
  Scenario: Put update user with valid json
    Given Put update user with valid json with id 2
    When Send request put update user
    Then Should return status code 200
    And Response body name should be "alan darma" and job "QA Engineer"

  #Silahkan tambahkan skenario negatif case dll

  @Tugas
  Scenario: Put update user with invalid json
    Given put update user with invalid json with id 2
    When Send request put update user
    Then Should return status code 404

  @Tugas
  Scenario: Put update with name only
    Given Put update with name only
    When Send request put update user
    Then Should return status code 404