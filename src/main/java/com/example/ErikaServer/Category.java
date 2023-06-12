package com.example.ErikaServer;

import jakarta.persistence.*;

@Entity
@Table(name="CATEGORIES")
public class Category {
    @Id
    @JoinColumn(name="category_id" ,referencedColumnName="CATEGORYID")
    private Long categoryID;
    @Column(name="CATEGORYNAME")
    private String categoryName;
    private String description;

    public Category(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category() {
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
