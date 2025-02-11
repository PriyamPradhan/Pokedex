package com.priyam.pokedex.controller;

import com.priyam.pokedex.model.Pokemon;
import com.priyam.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    public PokemonService pokemonService;

    @GetMapping("/pokemon/{poke}")
    public Pokemon getPokemon(@PathVariable("poke") String name){
        return pokemonService.getPokemon(name);

    }


    @GetMapping("/pile")
    public String getpile(){
        return pokemonService.getPile();
    }


}
