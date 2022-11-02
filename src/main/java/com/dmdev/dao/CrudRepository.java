package com.dmdev.dao;

public interface CrudRepository <K,E>{
    E findById(K id);

    void delete(K id);
}
