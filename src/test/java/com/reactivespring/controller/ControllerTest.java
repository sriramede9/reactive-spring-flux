package com.reactivespring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient.ListBodySpec;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@WebFluxTest
public class ControllerTest {

	@Autowired
	WebTestClient webTestClient;

//	@Test
//	public void getFlux_test() {
//
//		Flux<String> responseBody = webTestClient.get().uri("/flux").accept(MediaType.APPLICATION_JSON_UTF8).exchange()
//				.expectStatus().isOk().returnResult(String.class).getResponseBody();
//
//		StepVerifier.create(responseBody).expectSubscription().expectNext("aBc").verifyComplete();
//
//	}

//	@Test
//	public void getFlux_test_2() {
//
//		ListBodySpec<String> hasSize = webTestClient.get().uri("/flux").accept(MediaType.APPLICATION_JSON_UTF8)
//				.exchange().expectStatus().isOk().expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
//				.expectBodyList(String.class).hasSize(1);
//
//	}

//	@Test
//	public void getFlux_test_3() {
//
//		List<String> expected = Arrays.asList("aBc");
//
//		EntityExchangeResult<List<String>> returnResult = webTestClient.get().uri("/flux")
//				.accept(MediaType.APPLICATION_JSON_UTF8).exchange().expectStatus().isOk().expectHeader()
//				.contentType(MediaType.APPLICATION_JSON_UTF8).expectBodyList(String.class).returnResult();
//
//		assertEquals(expected, returnResult.getResponseBody());
//
//	}
//	@Test
//	public void getFlux_test_4() {
//
//		List<String> expected = Arrays.asList("aBc");
//
//		webTestClient.get().uri("/flux").accept(MediaType.APPLICATION_JSON_UTF8).exchange().expectStatus().isOk()
//				.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8).expectBodyList(String.class)
//				.consumeWith((result) -> {
//					assertEquals(expected, result.getResponseBody());
//				});
//
//	}
//	@Test
//	public void getFlux_test_4() {
//
////		List<String> expected = Arrays.asList("aBc");
//
//		Flux<Long> responseBody = webTestClient.get().uri("/fluxstreami").accept(MediaType.APPLICATION_STREAM_JSON)
//				.exchange().expectStatus().isOk().returnResult(Long.class).getResponseBody();
//
//		StepVerifier.create(responseBody).expectSubscription().expectNext(0l, 1l).thenCancel().verify();
//
//	}

	@Test
	public void mono_test() {

		webTestClient.get().uri("/mono").accept(MediaType.APPLICATION_JSON_UTF8).exchange().expectStatus().isOk()
				.expectBody(String.class).consumeWith((response) -> {
					assertEquals("1", response.getResponseBody());
				});

//		StepVerifier.create(responseBody).expectSubscription().expectNext("aBc").verifyComplete();

	}
}
