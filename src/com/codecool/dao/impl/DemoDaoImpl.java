package com.codecool.dao.impl;

import com.codecool.dao.DemoDao;
import com.codecool.model.DemoObject;

import java.util.ArrayList;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    private List<DemoObject> items = new ArrayList<>();

    public void addItem(DemoObject object){
        if(items.contains(object)){
            System.out.println("Not adding " + object + ", it's already in the store");
            return;
        }
        items.add(object);
    }

    public void removeItem(DemoObject object){
        items.remove(object);
    }

    public void removeById(int number){
        items.remove(new DemoObject(number));
    }

    public int count(){
        return items.size();
    }

}
