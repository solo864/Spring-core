package com.dmdev.dao;

import com.dmdev.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository {
    @Autowired
    private final ConnectionPool connectionPool;

    @Override
    public Object findById(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }
}
