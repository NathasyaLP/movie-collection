/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.moviescrud.controller;

import com.example.moviescrud.model.Movie;
import com.example.moviescrud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *
 * @author Nathasya
 */
@Controller
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public String getAllMovies(Model model) {
        List<Movie> movies = service.getAllMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @PostMapping
    public String saveMovie(@ModelAttribute Movie movie) {
        service.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        service.deleteMovie(id);
        return "redirect:/movies";
    }
}