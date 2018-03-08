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

public abstract class AbstractMobilePhone implements MobilePhone {

    protected String os = null;
    protected String brand = null;
    protected String manufacturer = null;

    @Override
    public String getOS() {
        return os;
    }

    @Override
    public void setOS(String os) {
        this.os = os;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.getClass().getSimpleName() + " [" + this.os + ", made by "
                + this.manufacturer + "]";
    }
}
