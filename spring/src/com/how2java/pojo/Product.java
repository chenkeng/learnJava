package com.how2java.pojo;

/**
 * @Auther: superhan
 * @Contact: chenchaohan@live.com
 * @Date: 2018/9/16 15:48
 * @Description:
 */
public class Product {
    private int id;
    private String name;
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
