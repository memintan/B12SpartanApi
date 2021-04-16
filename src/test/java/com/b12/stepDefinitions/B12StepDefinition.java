package com.b12.stepDefinitions;


import com.b12.utilities.ConfigurationReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.util.List;
import java.util.Map;

public class B12StepDefinition {

    private Response response;
    private RequestSpecification request;

    @Given("user accepts content type {string}")
    public void user_accepts_content_type(String type) {

        request = given().
                    contentType(type);
    }
    @When("user sends GET request to {string}")
    public void user_sends_GET_request_to(String endPoint) {
        response = request.
                    when().
                        get(endPoint).prettyPeek();
    }
    @Then("user verifies that status code is {int}")
    public void user_verifies_that_status_code_is(int statusCode) {
        response.
                then().
                    statusCode(statusCode);
    }
}