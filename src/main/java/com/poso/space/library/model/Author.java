package com.poso.space.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Author name is required")
    private String name;

    @NotBlank(message = "Nationality is required")
    private String nationality;

    public Author() {

    }

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
}
