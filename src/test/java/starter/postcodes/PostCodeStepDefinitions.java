package starter.postcodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeStepDefinitions {

    @Steps
    PostCodeAPI postCodeAPI;

    @When("I look up a post code {word} for country code {word}")
    public void lookUpAPostCode(String postCode, String country) {
        postCodeAPI.fetchLocationByPostCodeAndCountry(postCode, country);
    }

    @Then("the resulting location should be {} in {}")
    public void theResultingLocationShouldBe(String placeName, String country) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body(LocationResponse.COUNTRY, equalTo(country)));
        restAssuredThat(response -> response.body(LocationResponse.FIRST_PLACE_NAME, equalTo(placeName)));
    }

    @Given("Post create user with valid json")
    public void postCreateUserWithValidJson() {
    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {
    }

    @Then("Should return status code {int}")
    public void shouldReturnStatusCode(int arg0) {
    }

    @And("Response body name should be {string} and job {string}")
    public void responseBodyNameShouldBeAndJob(String arg0, String arg1) {
    }

    @And("Validate json schema create user")
    public void validateJsonSchemaCreateUser() {
    }

    @Given("Post create user with special character")
    public void postCreateUserWithSpecialCharacter() {
    }

    @Given("Post create user with numeric")
    public void postCreateUserWithNumeric() {
    }

    @Given("Post create user with invalid Json")
    public void postCreateUserWithInvalidJson() {
    }

    @Given("Post create user with no content")
    public void postCreateUserWithNoContent() {
    }

    @Given("Delete user with valid id <id>")
    public void deleteUserWithValidIdId() {
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
    }

    @Given("Delete user with invalid id <id>")
    public void deleteUserWithInvalidIdId() {
    }

    @Given("Get list user with page <page>")
    public void getListUserWithPagePage() {
    }

    @When("Send request get list user")
    public void sendRequestGetListUser() {
    }

    @And("Response body page should be <page>")
    public void responseBodyPageShouldBePage() {
    }

    @And("Validate json schema list user")
    public void validateJsonSchemaListUser() {
    }

    @Given("Get list user with page {string}")
    public void getListUserWithPage(String arg0) {
    }

    @Given("Get list user with invalid special character")
    public void getListUserWithInvalidSpecialCharacter() {
    }


    @Given("Put update user with valid json with id {int}")
    public void putUpdateUserWithValidJsonWithId(int arg0) {
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
    }

    @Given("put update user with invalid json with id {int}")
    public void putUpdateUserWithInvalidJsonWithId(int arg0) {
    }

    @Given("Put update with name only")
    public void putUpdateWithNameOnly() {
    }
}
