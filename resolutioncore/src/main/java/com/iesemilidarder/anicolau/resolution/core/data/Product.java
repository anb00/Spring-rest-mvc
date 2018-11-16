package com.iesemilidarder.asoto.resolution.core.data;

import java.util.UUID;

/**
 * com.iesemilidarder.asoto.resolution.core
 * Class Product
 * By berto. 14/11/2018
 */
public abstract class Product {
    private UUID id = UUID.randomUUID();
    private Double precio;
    private String name;
    private String description;
    private String imgUri;

    public UUID getId() {
        return id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }
}
