package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
