package com.parovsky.traver.service;

import com.parovsky.traver.dto.CategoryDTO;
import com.parovsky.traver.exception.impl.CategoryIsAlreadyExistException;
import com.parovsky.traver.exception.impl.CategoryNotFoundException;
import org.springframework.lang.NonNull;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryById(Long id) throws CategoryNotFoundException;

    CategoryDTO saveCategory(@NonNull CategoryDTO categoryDTO) throws CategoryIsAlreadyExistException;

    CategoryDTO updateCategory(@NonNull CategoryDTO categoryDTO) throws CategoryNotFoundException;

    void deleteCategory(Long id) throws CategoryNotFoundException;
}
