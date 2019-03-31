package br.com.marmodale.service;

import br.com.marmodale.model.Category;
import br.com.marmodale.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category save(Category category){
        return this.repository.save(category);
    }

    public Category getOne(Long id){
        return this.repository.getOne(id);
    }
}
