package com.codecool.dao;

import com.codecool.model.DemoObject;

/**
 * Interface example.
 */
public interface DemoDao {

    void addItem(DemoObject object);

    void removeItem(DemoObject object);

    void removeById(int id);

    int count();

}
