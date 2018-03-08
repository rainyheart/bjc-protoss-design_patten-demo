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
import java.math.MathContext;
import java.math.RoundingMode;

import com.bjc.protoss.dp.module.bridge.ken.CreditCard;

public abstract class AbstractCreditCard implements CreditCard {

    protected MathContext mathCtx = new MathContext(10, RoundingMode.HALF_UP);

    protected BigDecimal limit = null;
    protected BigDecimal remain = null;
    protected BigDecimal credit = null;

    public AbstractCreditCard(BigDecimal limit) {
        super();
        this.limit = limit;
        this.credit = new BigDecimal(0, mathCtx);
        this.remain = this.limit.subtract(credit, mathCtx);
    }

    @Override
    public boolean credit(BigDecimal money) {
        if (this.remain.compareTo(money) >= 0) {
            transaction(money);
            return true;
        }

        return false;
    }

    @Override
    public boolean repay(BigDecimal money) {
        if (this.credit.compareTo(money) >= 0) {
            transaction(money.negate());
        } else {
            this.remain = this.limit.add(money.subtract(this.credit));
            this.credit = new BigDecimal(0);
        }
        return true;
    }

    protected void transaction(BigDecimal money) {
        this.credit = this.credit.add(money);
        this.remain = this.remain.subtract(money);
    }

}
