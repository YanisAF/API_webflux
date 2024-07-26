package com.example.__demo_webflux.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {
    private int count;
    private String next;
    private String previous;
    private List<Pokemon> results;
}
