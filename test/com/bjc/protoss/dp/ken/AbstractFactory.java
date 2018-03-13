package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.abstractfactory.ken.BMWFactory;
import com.bjc.protoss.dp.module.abstractfactory.ken.Car;
import com.bjc.protoss.dp.module.abstractfactory.ken.Factory;
import com.bjc.protoss.dp.module.abstractfactory.ken.PorscheFactory;
import com.bjc.protoss.dp.module.abstractfactory.ken.ToyFactory;

/**
 *
 * Definition:<br/>
 * Factory pattern is one of most used design patterns in Java. This
 * type of
 * design pattern comes under creational pattern as this pattern
 * provides one of
 * the best ways to create an object. In Factory pattern, we create
 * objects
 * without exposing the creation logic to the client and refer to
 * newly created
 * object using a common interface.
 *
 */
public class AbstractFactory {

    @Test
    public void toy() {
        createAndTest("toy");
    }

    @Test
    public void bmw() {
        createAndTest("BMW");
    }

    @Test
    public void porsche() {
        createAndTest("Porsche");
    }

    private void createAndTest(String parameter) {
        Factory factory = null;
        if ("toy".equalsIgnoreCase(parameter)) {
            factory = new ToyFactory();
        } else if ("BMW".equalsIgnoreCase(parameter)) {
            factory = new BMWFactory();
        } else if ("Porsche".equalsIgnoreCase(parameter)) {
            factory = new PorscheFactory();
        } else {
            System.err.println("Invalid parameter");
            return;
        }

        Car car = (Car) factory.produce();
        car.run(true);
        car.stop();
    }

}
