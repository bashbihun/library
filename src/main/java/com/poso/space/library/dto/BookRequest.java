package com.poso.space.library.dto;

import lombok.Data;

@Data
public class BookRequest {

    private String title;
    private String isbn;
    private Integer publishedYear;
    private Long authorId;

}
