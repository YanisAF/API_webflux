package com.example.__demo_webflux.service;

import com.example.__demo_webflux.Model.Pokemon;
import com.example.__demo_webflux.Model.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Pokemon> getAllPokemons() {
        List<Pokemon> allPokemons = new ArrayList<>();
        String url = "https://pokeapi.co/api/v2/pokemon?limit=100";
        PokemonResponse response = restTemplate.getForObject(url, PokemonResponse.class);
        allPokemons.addAll(response.getResults());

        return allPokemons;
    }
}
