package com.example.ErikaServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository rep;

    public String getDescription(){
        String description = "";
        Iterable<Category> categorys = this.rep.findAll();
        if (categorys != null && categorys.iterator().hasNext()){
            description = categorys.iterator().next().getDescription();
        }

        return description;
    }
    public String setDescription(String description, String categoryName){
        Category category = new Category(description, categoryName);
        Category returnCat = rep.save(category);
        return returnCat.getDescription();
    }

    public List<Category> getCategory(){
        return rep.findAll();
    }

    public Category addCategory(Category cat){
        return rep.save(cat);
    }

    public  CategoryRepository getCategoryRep(){
        return rep;
    }
}
