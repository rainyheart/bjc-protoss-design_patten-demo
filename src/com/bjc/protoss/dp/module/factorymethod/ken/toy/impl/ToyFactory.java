/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.factorymethod.ken.toy.impl;

import com.bjc.protoss.dp.module.factorymethod.ken.Factory;
import com.bjc.protoss.dp.module.factorymethod.ken.Product;

public abstract class ToyFactory implements Factory {

    @Override
    public Product produce() {
        Product product = produceToy();
        return product;
    }

    protected abstract Product produceToy();
}
