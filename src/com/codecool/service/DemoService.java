package com.codecool.service;

import com.codecool.dao.DemoDao;
import com.codecool.model.DemoObject;

/**
 * Service class, which is responsible for the manipulation of our objects.
 */
public class DemoService {

    private int counter = 0;

    // single private member - there will be exactly one since
    // the service itself is singleton.
    private DemoDao dao;

    // intentionally left package protected - so it can be only instantiated from the factory
    // see, singleton pattern.
    DemoService(DemoDao dao){
        this.dao = dao;
    }

    public void doSomeStuff(){

        DemoObject demoObject = new DemoObject();

        System.out.println("Item count before insert: " + dao.count());

        dao.addItem(demoObject);

        System.out.println("After insert: " + dao.count());

        dao.removeItem(demoObject);

        System.out.println("After removing the previously inserted element: " + dao.count());

        DemoObject demoObject2 = new DemoObject();

        System.out.println("Id of the second object: " + demoObject2.getId());

        dao.addItem(demoObject2);

        System.out.println("Count after adding demoObject2: " + dao.count());

        dao.removeById(2);

        System.out.println("Count after removing by id: " + dao.count());


    }

    /**
     * Describe here what this method does.
     */
    public void staticNumberingDemonstration(){

        DemoObject demoObject3 = new DemoObject();
        DemoObject demoObject4 = new DemoObject();

        System.out.println("Count in demoObject3: " + demoObject3.printCount());
        System.out.println("Count in demoObject4: " + demoObject4.printCount());

        demoObject3.setCounter(0);

        // What's the problem here?
        System.out.println("Count in demoObject3: " + demoObject3.printCount());
        System.out.println("Count in demoObject4: " + demoObject4.printCount());

    }

    public void numberingInService(){

        DemoObject object1 = new DemoObject(counter++);
        DemoObject object2 = new DemoObject(counter++);

        System.out.println("Object 1, id: " + object1.getId());
        System.out.println("Object 2, id: " + object2.getId());

    }

}
