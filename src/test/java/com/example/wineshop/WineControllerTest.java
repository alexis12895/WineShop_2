package com.example.wineshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class WineControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newWine() {
    }

    @Test
    /**
     * Verificamos ok y datos recibidos.
     */
    void all() {
        webTestClient.get()
                .uri("/wine")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().valueEquals("Content-Type","application/hal+json");
    }

    @Test
    void one() {
        webTestClient.get()
                .uri("/wine/42")
                .exchange()
                .expectBody()
                .jsonPath("$.name")
                .isEqualTo("Pasión");
    }

    @Test
    void createWine() {

        Wine vino = new Wine();
        webTestClient.post()
                .uri("/wine")
                .bodyValue(vino)
                .exchange()
                .expectStatus()
                .isCreated();


    }

    @Test
    void deleteWine() {
        webTestClient.delete()
                .uri("/wine/70")
                .exchange()
                .expectStatus().isEqualTo(204);
    }

    @Test
    void wineNotFound(){
        webTestClient.get()
                .uri("/wine/751")
                .exchange()
                .expectStatus().isNotFound();
    }
}