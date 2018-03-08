/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.builder.ken.impl;

import com.bjc.protoss.dp.module.builder.ken.MobilePhone;
import com.bjc.protoss.dp.module.builder.ken.MobilePhoneBuilder;

public class AppleBuilder implements MobilePhoneBuilder {
    private MobilePhone product = null;

    @Override
    public void buildSoftware() {
        if (product == null) {
            throw new UnsupportedOperationException("Hardware is not produced");
        }

        product.setBrand("Apple");
        product.setOS("IOS 11");
        product.setManufacturer("Foxconn");
    }

    @Override
    public void buildHardware() {
        product = new IPhoneX();
    }

    @Override
    public MobilePhone getProduct() {
        return this.product;
    }

}
