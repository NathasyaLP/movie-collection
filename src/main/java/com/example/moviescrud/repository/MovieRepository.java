/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.moviescrud.repository;

import com.example.moviescrud.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Nathasya
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
