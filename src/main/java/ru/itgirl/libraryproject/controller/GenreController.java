package ru.itgirl.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.libraryproject.dto.GenreDto;
import ru.itgirl.libraryproject.service.GenreService;
@RestController
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/genre/{id}")
    GenreDto getBookByGenreId(@PathVariable ("id") Long id){
        return genreService.getBookByGenreId(id);
    }
}
