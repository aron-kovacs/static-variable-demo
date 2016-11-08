package com.codecool;

import com.codecool.service.DemoService;
import com.codecool.service.ServiceFactory;

public class Main {

    // main method is the single entry point of our application
    // it SHOULD only be used to start the main logic of the application
    // no business logic here!
    public static void main(String[] args) {

        DemoService service =
                new ServiceFactory()
                        .createService();

        service.doSomeStuff();

        service.staticNumberingDemonstration();

        service.numberingInService();

    }
}
