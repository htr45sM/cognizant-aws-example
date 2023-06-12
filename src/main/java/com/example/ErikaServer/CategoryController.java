package com.example.ErikaServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CategoryController {
    @Autowired
    private CategoryService service;

    public CategoryService getService(){
        return service;
    }

    public void setService(CategoryService  service) {
        this.service = service;
    }

    @GetMapping(value="all", produces="application/json")
    public List<Category> getCategory(){
        return service.getCategory();
    }

    @PostMapping(value="add", produces="application/json")
    public Category addCategory(@RequestBody Category cat){
        return service.addCategory(cat) ;
    }
}
