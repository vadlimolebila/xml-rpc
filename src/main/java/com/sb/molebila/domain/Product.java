package com.sb.molebila.domain;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 2꞉00 AM
 */
public class Product {

    private String name;

    private String category;

    private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
