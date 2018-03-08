/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.prototype.ken;

public class Atom implements Cloneable {

    private final Integer mass;
    private final Integer chargeNumber;

    public Atom(Integer mass, Integer chargeNumber) {
        this.mass = mass;
        this.chargeNumber = chargeNumber;
    }

    public Integer getMass() {
        return mass;
    }

    public Integer getChargeNumber() {
        return chargeNumber;
    }

    @Override
    public Atom clone() {
        // TODO Auto-generated method stub
        try {
            return (Atom) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
