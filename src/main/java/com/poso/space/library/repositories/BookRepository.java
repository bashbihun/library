package com.poso.space.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poso.space.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
