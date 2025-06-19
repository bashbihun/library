package com.poso.space.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poso.space.library.dto.BookRequest;
import com.poso.space.library.exception.ResourceNotFoundException;
import com.poso.space.library.model.Author;
import com.poso.space.library.model.Book;
import com.poso.space.library.repositories.AuthorRepository;
import com.poso.space.library.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
    }

    public Book createBook(BookRequest request) {
        Author author = authorRepository.findById(request.getAuthorId()).orElse(null);
        if (author == null)
            return null;

        Book book = new Book(
                request.getTitle(),
                request.getIsbn(),
                request.getPublishedYear(),
                author);
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, BookRequest request) {
        Book existing = getBookById(id);
        Author author = authorRepository.findById(request.getAuthorId()).orElse(null);
        if (existing != null && author != null) {
            existing.setTitle(request.getTitle());
            existing.setIsbn(request.getIsbn());
            existing.setPublishedYear(request.getPublishedYear());
            existing.setAuthor(author);
            return bookRepository.save(existing);
        }
        return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
