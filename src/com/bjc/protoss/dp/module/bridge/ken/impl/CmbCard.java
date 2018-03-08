/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.bridge.ken.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.bjc.protoss.dp.module.bridge.ken.CreditCard;

public class CmbCard extends AbstractCreditCard implements CreditCard {

    public CmbCard(BigDecimal limit) {
        super(limit);
        this.limit.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.credit.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.remain.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public void printStatus() {
        System.out.println("************************************");
        System.out.println("Welcome to use CMB credit card.");
        System.out.println("Your limit is: " + this.limit.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Your credit amound is: " + this.credit.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Your remain amound is: " + this.remain.setScale(2, RoundingMode.HALF_UP));
        System.out.println("************************************");
    }

}
