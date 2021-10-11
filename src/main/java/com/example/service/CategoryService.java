package com.example.service;

import com.example.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CategoryService {
    @Autowired
    List<Category> selectCategoryList();
}
