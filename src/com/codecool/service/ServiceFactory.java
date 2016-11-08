package com.codecool.service;

import com.codecool.dao.impl.DemoDaoImpl;

/**
 * Factory used to create Service objects, see Singleton pattern.
 */
public class ServiceFactory {

    private DemoService demoService;

    public DemoService createService(){
        if(demoService == null){
            demoService = new DemoService(new DemoDaoImpl());
        }
        return demoService;
    }

}
