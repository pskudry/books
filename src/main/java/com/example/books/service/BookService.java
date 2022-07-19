package com.example.books.service;

import com.example.books.dao.entity.Book;
import com.example.books.dao.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book createBook(final String title, final String authors){
        final Book book = new Book();
        book.setTitle(title);
        book.setAuthors(authors);
        return this.bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return this.bookRepository.findAll().stream().collect(Collectors.toList());
    }

    public List<Book> getBooksByAuthor(final String author) {
        return this.bookRepository.findAll().stream().filter(b-> author.equals(b.getAuthors())).collect(Collectors.toList());
    }
}
