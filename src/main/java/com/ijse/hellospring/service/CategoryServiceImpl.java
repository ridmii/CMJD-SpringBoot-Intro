package com.ijse.hellospring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ijse.hellospring.entity.Category;
import com.ijse.hellospring.repository.CategoryRepository;

@Service // Mark this class as a service
public class CategoryServiceImpl implements CategoryService {

    // Inject the repository dependency
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        // Call the repository method on the injected instance
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        // Call the repository method on the injected instance
        return categoryRepository.findById(id).orElse(null);
    }

    @Override 
    public Category createCategory(Category category) {
        // Call the repository method on the injected instance
        return categoryRepository.save(category);
    }
}
