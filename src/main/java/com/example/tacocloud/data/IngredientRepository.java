package com.example.tacocloud.data;

import java.util.Optional;

import com.example.tacocloud.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();

	Optional<Ingredient> findById(String id);

	Ingredient save(Ingredient ingredient);
}
