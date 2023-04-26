package com.example.webfluxapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void getJust() throws Exception {
        mockMvc.perform(get("/monoJust"))
                .andExpect(status().isOk());
    }

    @Test
    void getZip() throws Exception {
        mockMvc.perform(get("/monoZip"))
                .andExpect(status().isOk());
    }

    @Test
    void getFluxJust() throws Exception {
        mockMvc.perform(get("/FluxJust"))
                .andExpect(status().isOk());
    }

    @Test
    void getFluxZip() throws Exception {
        mockMvc.perform(get("/FluxZip"))
            .andExpect(status().isOk());
    }

    @Test
    void getFluxInterval() throws Exception {
        mockMvc.perform(get("/FluxInterval"))
                .andExpect(status().isOk());
    }
}