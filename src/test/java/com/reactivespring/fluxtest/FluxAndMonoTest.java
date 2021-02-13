package com.reactivespring.fluxtest;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMonoTest {

//	@Test
//	public void fluxTest() {
//		Flux<String> just = Flux.just("A", "B", "C")
////				.concatWith(Flux.error(new RuntimeException("throws an exception")))
//				.concatWith(Flux.just("After exception")).log();
//
//		just.subscribe(System.out::println, (ex) -> {
//			System.out.println("exception occured" + ex.getLocalizedMessage());
//		}, () -> System.out.print("Complete event from Flux"));
//
////		just.subscribe
//
//	}

//	@Test
//	public void fluxTestElements_withoutError() {
//		Flux<String> log = Flux.just("A", "B", "C").log();
//
//		StepVerifier.create(log).expectNext("A", "B", "C").verifyComplete();
//	}

//	@Test
//	public void fluxTestElements_withError() {
//		Flux<String> log = Flux.just("A", "B", "C").concatWith(Flux.error(new RuntimeException("THrow Error"))).log();
//
//		StepVerifier.create(log).expectNext("A", "B", "E")
//		.expectError(RuntimeException.class).verify();
////		.verifyErrorMessage("THrow Error");
////		.verifyComplete();
//	}
//	
//	@Test
//	public void fluxTestElementsCount_withError() {
//		Flux<String> log = Flux.just("A", "B", "C").concatWith(Flux.error(new RuntimeException("THrow Error"))).log();
//
//		StepVerifier.create(log).expectNextCount(3).expectError(RuntimeException.class).verify();
//
//	}
	@Test
	public void MonoTest() {

		Mono<String> just = Mono.just("Alpha");

//		just.subscribe(System.out::println);

		StepVerifier.create(just.log()).expectNext("Alpha").verifyComplete();

	}
}
