package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.dto.GenreDto;

import java.util.List;

public interface GenreService {
    GenreDto getBookByGenreId(Long id);
}
