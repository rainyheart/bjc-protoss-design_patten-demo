/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.abstractfactory.ken;

import com.bjc.protoss.dp.module.abstractfactory.ken.impl.ToyCar;

public class ToyFactory implements Factory {
    @Override
    public Product produce() {
        Car car = new ToyCar();

        return car;
    }
}
