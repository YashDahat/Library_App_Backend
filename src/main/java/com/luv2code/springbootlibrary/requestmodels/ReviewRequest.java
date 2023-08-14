package com.luv2code.springbootlibrary.requestmodels;

import lombok.Data;

import java.util.Optional;

@Data
public class ReviewRequest {
    private Long rating;
    private Long bookId;
    private Optional<String> reviewDescription;
}
