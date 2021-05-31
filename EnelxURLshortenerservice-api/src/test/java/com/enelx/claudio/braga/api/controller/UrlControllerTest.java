package com.enelx.claudio.braga.api.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.enelx.claudio.braga.domain.model.UrlShortener;
import com.enelx.claudio.braga.domain.repository.UrlRepository;
import com.enelx.claudio.braga.domain.service.CreateUrlShortenerService;

import io.restassured.http.ContentType;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@WebMvcTest
public class UrlControllerTest {
	
	@Autowired
	private UrlController urlController;
	
	@MockBean
	private UrlRepository urlRepository;
	
	@MockBean
	private UrlShortener urlShortener;
	
	@MockBean
	private CreateUrlShortenerService UrlShortenerService;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.urlController);
	}
	
	@Test
	public void shouldReturnNotFound_WhenGetShortUrl() {
		
		given()
			.accept(ContentType.JSON)
		.when()
			.get("/urls/shortenerUrl/shortUrl=abcdeef")
		.then()
			.statusCode(HttpStatus.NOT_FOUND.value());
	}
	
	@Test
	public void shouldReturnBadRequest_WhenCreateShortUrl() {
		
		given()
			.accept(ContentType.JSON)
		.when()
			.post("/urls")
		.then()
			.statusCode(HttpStatus.BAD_REQUEST.value());
	}
}
