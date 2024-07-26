package com.example.__demo_webflux.controller;

import com.example.__demo_webflux.Model.Pokemon;
import com.example.__demo_webflux.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/api/data")
    public List<Pokemon> data() {
        return apiService.getAllPokemons();
    }
}
