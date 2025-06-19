package com.poso.space.library.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookRequest {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "ISBN is required")
    private String isbn;

    @NotNull(message = "Published year is required")
    @Min(value = 1000, message = "Year should be realistic")
    private Integer publishedYear;

    @NotNull(message = "Author ID is required")
    private Long authorId;

}
