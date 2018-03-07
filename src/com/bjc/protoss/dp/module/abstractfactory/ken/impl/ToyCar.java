/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.abstractfactory.ken.impl;

import com.bjc.protoss.dp.module.abstractfactory.ken.Car;

public class ToyCar implements Car {

    public ToyCar() {
        System.out.println("A toy car is produced");
    }

    @Override
    public void run(boolean forwardOrbackward) {
        System.out.println("A toy car is running " + (forwardOrbackward ? "forward" : "backward"));

    }

    @Override
    public void stop() {
        System.out.println("A toy car is stopped");

    }

}
