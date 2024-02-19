package org.example.moviservice.controllers;

import org.example.moviservice.model.Movi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MoviesController {
    @GetMapping("/movies")//поменять название
    public String movies() throws IOException {
        Movi movies = new Movi();

        String result = movies.searchPage("Thor");

        return result;
    }
}
