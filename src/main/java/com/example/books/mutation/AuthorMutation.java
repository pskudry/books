package com.example.books.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.books.dao.entity.Author;
import com.example.books.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorMutation implements GraphQLMutationResolver {

    private AuthorService authorService;

    public Author createAuthor(final String name, final String books){
        return  this.authorService.createAuthor(name, books);
    }
}
