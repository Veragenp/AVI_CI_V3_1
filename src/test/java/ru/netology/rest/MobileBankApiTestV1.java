package ru.netology.rest;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV1 {
    @Test
    void shouldMatchesJsonSchema() {
        // Given - When - Then
        // Предусловия
        ValidatableResponse body = given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200);
        //.body("", hasSize(3));
        // .body("[0].id", equalTo(1));
    }
}
