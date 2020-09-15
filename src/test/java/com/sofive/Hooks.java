package com.sofive;

import com.sofive.config.ReqresEnvironments;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Hooks {
    public static RequestSpecification requestSpecification;

    public static ResponseSpecification responseSpecification;

    @Before("@ApiRestJson")
    public static void setUp(){

        System.out.println("Este es un Api Rest Test");

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(ReqresEnvironments.REDMINE_LOCAL)
                .setPort(ReqresEnvironments.REDMINE_LOCAL_PORT)
                .setBasePath("/")
                .addHeader("Content-Type","application/json")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();

        responseSpecification = new ResponseSpecBuilder()
                .build();

        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;
    }

    @After("@ApiRestJson")
    public static void cleanUp(){
        RestAssured.reset();
    }

}
