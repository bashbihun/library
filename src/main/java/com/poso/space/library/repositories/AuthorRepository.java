package com.poso.space.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poso.space.library.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
