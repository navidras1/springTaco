package com.example.demo.data;

import java.util.Optional;

import com.example.demo.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
