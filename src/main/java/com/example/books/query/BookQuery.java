package com.example.books.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.books.dao.entity.Book;
import com.example.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookQuery implements GraphQLQueryResolver {
    private BookService bookService;

    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    public List<Book> getBooksByAuthor(final String author){
        return this.bookService.getBooksByAuthor(author);
    }
}
