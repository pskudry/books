package com.example.books.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.books.dao.entity.Book;
import com.example.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMutation implements GraphQLMutationResolver {

    private BookService bookService;

    public Book createBook(final String title, final String authors){
        return this.bookService.createBook(title, authors);
    }
}
