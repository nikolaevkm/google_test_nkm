package googleSearchTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class DeserializationAndAssert {

    @Test
    @JsonIgnoreProperties(ignoreUnknown = true)

    public void ResultGreaterThan() {



        RestAssured.baseURI = "https://www.googleapis.com/customsearch/v1?key=AIzaSyB-shBKKHAH6Z57OJUiBG7T3ZFIEwK9kaA&cx=014256437078447789418:5tkohha4nzl&q=открытие";

        RequestSpecification request = given();

        Response response = request.get( "https://www.googleapis.com/customsearch/v1?key=AIzaSyB-shBKKHAH6Z57OJUiBG7T3ZFIEwK9kaA&cx=014256437078447789418:5tkohha4nzl&q=открытие" );

        ResponseBody body = response.getBody();

        GoogleJSON responseBody = body.as( GoogleJSON.class );

        //int greaterAssert = 10000;

        System.out.println(responseBody.totalResults);

        //Assert.assertTrue( intTotal > greaterAssert );


    }

}

//как десериализовать массив пока не понял
