package com.example.webfluxapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/monoJust")
    public Mono<String> getJust() {
        return Mono.just("Mono-just");
    }
    /*@GetMapping("/monoZip")
    public Mono<String> getString() {
        return Mono.zip("Mono-zip");
    }*/

}
