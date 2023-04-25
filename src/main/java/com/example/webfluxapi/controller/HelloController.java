package com.example.webfluxapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/monoJust")
    public Mono<String> getJust() {
        return Mono.just("Mono-just");
    }

    @GetMapping("/monoZip")
    public Mono<String> getZip() {
        Mono<String> mono1 = Mono.just("Mono1");
        Mono<String> mono2 = Mono.just("Mono2");
        return Mono.zip(mono1, mono2).map(
                tuple -> tuple.getT1() + tuple.getT2());
    }

    @GetMapping("/FluxJust")
    public Flux<String> getFluxJust() {
        return Flux.just("Flux-just");
    }

    @GetMapping("/FluxZip")
    public Flux<String> getFluxZip() {
        Flux<String> flux1 = Flux.just("flux1");
        Flux<String> flux2 = Flux.just("flux2");
        return Flux.zip(flux1, flux2).map(
                tuple -> tuple.getT1() + tuple.getT2());
    }

    @GetMapping("/FluxInterval")
    public Flux<String> getFluxInterval() {
        return Flux.interval(Duration.ofMillis(300))
                .map(i -> i + " " + LocalDateTime.now())
                .take(10);
    }

}
