package com.b12.stepDefinitions;

import com.b12.utilities.ConfigurationReader;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
    @Before
    public void setup() {
        RestAssured.baseURI = ConfigurationReader.getProperty("url");
        RestAssured.port = Integer.parseInt(ConfigurationReader.getProperty("port"));
    }
}
