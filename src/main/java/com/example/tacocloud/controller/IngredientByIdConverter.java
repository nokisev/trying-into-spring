package com.example.tacocloud.controller;

import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import com.example.tacocloud.Ingredient;
import com.example.tacocloud.data.IngredientRepository;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{

	private IngredientRepository ingredientRepo;

	public IngredientByIdConverter(IngredientRepository ingredientRepo) {
		this.ingredientRepo = ingredientRepo;
	}

	@Override
	public Ingredient convert(String id) {
		return ingredientRepo.findById(id).orElse(null);
	}
}
