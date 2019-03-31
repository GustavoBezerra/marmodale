package br.com.marmodale.service;

import br.com.marmodale.model.Ingredient;
import br.com.marmodale.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository repository;

    public Ingredient save(Ingredient ingredient){
        return this.repository.save(ingredient);
    }

    public Ingredient getOne(Long id){
        return this.repository.getOne(id);
    }
}
