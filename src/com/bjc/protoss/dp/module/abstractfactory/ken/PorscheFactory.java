package com.bjc.protoss.dp.module.abstractfactory.ken;

import com.bjc.protoss.dp.module.abstractfactory.ken.impl.Porsche;

public class PorscheFactory implements Factory {
    public Product produce() {
        Car car = new Porsche();

        return car;
    }
}
