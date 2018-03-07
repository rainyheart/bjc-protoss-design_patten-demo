/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.factorymethod.ken.Factory;
import com.bjc.protoss.dp.module.factorymethod.ken.Product;
import com.bjc.protoss.dp.module.factorymethod.ken.car.impl.PorscheFactory;
import com.bjc.protoss.dp.module.factorymethod.ken.toy.impl.LegoFactory;

public class FactoryMethod {

    @Test
    public void porsche() {
        Factory factory = new PorscheFactory();
        Product product = factory.produce();

        System.out.println(product.getName() + " is created.");
    }

    @Test
    public void lego() {
        Factory factory = new LegoFactory();
        Product product = factory.produce();

        System.out.println(product.getName() + " is created.");
    }
}
