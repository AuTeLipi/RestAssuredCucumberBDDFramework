package com.LipiAutomation.step.definitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.json.JSONArray;

import java.net.URI;

public class DemoRestAPITest {

    private Scenario scenario;
    private Response response;
    private final String BASE_URL = "http://localhost:3000";

    @Before
    public void before(Scenario scenarioVal) {
        this.scenario = scenarioVal;
    }

    @Given("Get Call to {string}")
    public void getCallTo(String url) throws Exception {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification req = RestAssured.given();
        response = req.when().get(new URI(url));
    }

    @Then("Response Code {string} is validated")
    public void responseCodeIsValidated(String responseMessage) {
        int responseCode = response.then().extract().statusCode();
        Assert.assertEquals(responseMessage, responseCode+"");
    }

    @Then("Response  is array total {string}")
    public void responseIsArrayTotal(String arg0) {
        response.then().statusCode(200);
        response = response.then().extract().response();
        scenario.log("Response Received == " + response.asPrettyString());
        JSONArray resJson = new JSONArray(response.asString());
        Assert.assertEquals(resJson.length()+"",arg0);
    }
}
