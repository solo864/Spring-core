package com.dmdev.database.repository;

import com.dmdev.bpp.InjectBean;
import com.dmdev.bpp.Transaction;
import com.dmdev.database.entity.Company;
import com.dmdev.database.pool.ConnectionPool;
import java.util.Optional;
import javax.annotation.PostConstruct;

@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company>{

    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init () {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}


