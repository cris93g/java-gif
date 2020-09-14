package com.treehous.giflib.data;

import com.treehous.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
        private static final List<Category> ALL_CATEGORIES= Arrays.asList(
                new Category("Technology", 1),
                new Category("People", 2),
                new Category("Destruction", 3)
        );
    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for(Category category: ALL_CATEGORIES){
            if(category.getId()==id){
                    return category;
            }
        }
        return null;
    }
}

