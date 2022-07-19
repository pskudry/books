package com.example.books.service;

import com.example.books.dao.entity.Author;
import com.example.books.dao.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author createAuthor(final String name, final String books){
        final Author author = new Author();
        author.setName(name);
        author.setBooks(books);
        return this.authorRepository.save(author);
    }

    public Author getAuthor(final String name) {
        return this.authorRepository.findAll().stream()
                .filter(author -> name.equals(author.getName()))
                .collect(Collectors.toList()).get(0);
    }
}
