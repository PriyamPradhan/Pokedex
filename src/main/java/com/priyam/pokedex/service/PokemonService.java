package com.priyam.pokedex.service;

import com.priyam.pokedex.model.Pokemon;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    @Autowired
    public RestTemplate restTemplate;

    private static final String API = "https://pokeapi.co/api/v2/pokemon/POKE";

    public Pokemon getPokemon(String name){
        String finalAPI = API.replace("POKE", name);
        ResponseEntity<Pokemon> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, Pokemon.class);
        return response.getBody();
    }

    public String getPile() {
        return "Hello";
    }
}
