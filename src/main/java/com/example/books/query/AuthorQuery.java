package com.example.books.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.books.dao.entity.Author;
import com.example.books.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorQuery implements GraphQLQueryResolver {
    private AuthorService authorService;

    public Author getAuthor(final String name) {
        return this.getAuthor(name);
    }
}
