package com.reactivespring.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FluxAndMonoController {

	@GetMapping(path = "/flux")
	public Flux<String> getFlux() {

		Flux<String> just = Flux.just("a", "B", "c");

		return just.delayElements(Duration.ofSeconds(1)).log();
	}

	@GetMapping(path = "/fluxstream", produces = "application/stream+json")
	public Flux<String> getFluxStream() {

		Flux<String> just = Flux.just("a", "B", "c", "d");

		return just.delayElements(Duration.ofSeconds(1)).log();
//		return just.interval(Duration.ofSeconds(1)).log();
	}

	@GetMapping(path = "/fluxstreami", produces = "application/stream+json")
	public Flux<Long> getFluxStreamInt() {

		return Flux.interval(Duration.ofSeconds(1)).log();
	}

	@GetMapping(path = "/mono")
	public Mono<String> getMono() {

		Mono<String> just = Mono.just("1");

		return just.log();
	}

}
