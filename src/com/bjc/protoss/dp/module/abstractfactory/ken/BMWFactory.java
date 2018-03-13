package com.bjc.protoss.dp.module.abstractfactory.ken;

import com.bjc.protoss.dp.module.abstractfactory.ken.impl.BMW;

public class BMWFactory implements Factory {
    public Product produce() {
        Car car = new BMW();

        return car;
    }
}
