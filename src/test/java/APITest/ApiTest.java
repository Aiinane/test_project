package APITest;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
//import static io.restassured.path.json.JsonPath;


public class ApiTest  {
    private final String endPoint = "https://swapi.dev/api/";
    private final String patchPeople = "/people/1/";
   private final String patchPlanet = "/planets/";


    public ApiTest() {


    }

    @Test
    public void getEndPoints() {
        given()
                .contentType("application/json")
                .when()
                .get(endPoint)
                .then()
                .assertThat().statusCode(200)
                .extract()
                .response()
                .prettyPrint();
    }

    @Test
    public void getPeople() {

        given()
                .contentType("application/json")
                .when()
                .get(endPoint + patchPeople)
                .then()
                .assertThat().statusCode(200)
                .extract()
                .response()
                .prettyPrint();
    }

    @Test
    public void getNameCharacter() {
        Response response =
                given()
                .contentType(JSON)
                .when()
                .get(endPoint + patchPeople)
                .then()
                .assertThat().statusCode(200)
                .extract()
                .response();
        String name = response.path("name");
        String homeWord = response.path("homeworld");
        System.out.println("\n"+ name+"\n"+homeWord);
    }

   @Test
    public void getNamePlAndPop(){
Response response =
        given()
            .contentType(JSON)
                .when()
                .get(endPoint+patchPlanet)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();

       List namePlanet =response.jsonPath().getList("results.name");
       List populationPlanet =response.jsonPath().getList("results.population");
       List nameFilm =response.path("results.films[0]");
       List residentName =response.jsonPath().getList("results.residents [0]");
        //String namePlanet = response.jsonPath().get("name");
       // String populationPlanet = response.path("population");
       // String nameFilm = response.path("results.films[1]");
       // String residentName = response.path("results.residents [1]");
       System.out.println("\n"+ namePlanet.get(0)+"\n"+populationPlanet+"\n"+ nameFilm.get(0)+"\n"+residentName.get(0));
    }
}

