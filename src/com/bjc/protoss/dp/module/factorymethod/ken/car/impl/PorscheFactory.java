/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.factorymethod.ken.car.impl;

import com.bjc.protoss.dp.module.factorymethod.ken.Product;

public class PorscheFactory extends CarFactory {

    @Override
    protected Product produceCar() {
        Product porsche = new Porsche();
        return porsche;
    }

}
