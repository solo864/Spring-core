package com.dmdev.dao;

import com.dmdev.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepository {
    private final ConnectionPool connectionPool;
}
