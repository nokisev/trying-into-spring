package com.example.tacocloud.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
	Iterable<Ingredient> findAll();

	Optional<Ingredient> findById(String id);

	Ingredient save(Ingredient ingredient);
}
