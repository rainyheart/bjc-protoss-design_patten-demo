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

import com.bjc.protoss.dp.module.bridge.ken.CreditCard;
import com.bjc.protoss.dp.module.bridge.ken.PosMachine;

public class NormalPosMachine implements PosMachine {

    private CreditCard creditCard = null;

    @Override
    public void insertCreditCard(CreditCard card) {
        if (this.creditCard != null) {
            throw new UnsupportedOperationException(
                    "There is an existing credit card in this pos machine, please remove it first!");
        }
        this.creditCard = card;
    }

    @Override
    public boolean credit(BigDecimal money) {
        return creditCard.credit(money);
    }

    @Override
    public CreditCard removeCreditCard() {
        CreditCard card = creditCard;
        creditCard = null;
        return card;

    }

}
