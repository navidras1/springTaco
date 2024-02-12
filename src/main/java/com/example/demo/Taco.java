package com.example.demo;

import java.util.Date;
import java.util.List;

import com.example.demo.data.IngredientRef;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

    private long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private List<IngredientRef> ingredients;
}
