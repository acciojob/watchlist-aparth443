package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie){
        return movieRepository.addMovie(movie);
    }

    public String addDirector(Director director){
        return movieRepository.addDirector(director);
    }

    public String addMovieDirectorPair(String movieName, String directorName){
        return movieRepository.addMovieDirectorPair(movieName,directorName);
    }

    public Movie getMovieByName(String name){
        return movieRepository.getMovieByName(name);
    }

    public Director getDirectorByName(String name){
        return movieRepository.getDirectorByName(name);
    }

    public ArrayList<String> getMoviesByDirectorName(String name){
        return movieRepository.getMoviesByDirectorName(name);
    }

    public ArrayList<String> findAllMovies(){
        return movieRepository.findAllMovies();
    }

    public String deleteDirectorByName(String name){
        return movieRepository.deleteDirectorByName(name);
    }

    public String deleteAllDirectors(){
        return movieRepository.deleteAllDirectors();
    }
}
