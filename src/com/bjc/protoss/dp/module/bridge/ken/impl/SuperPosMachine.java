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
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.bjc.protoss.dp.module.bridge.ken.CreditCard;
import com.bjc.protoss.dp.module.bridge.ken.PosMachine;

public class SuperPosMachine implements PosMachine {

    private Queue<CreditCard> creditCards = new LinkedBlockingQueue<CreditCard>();

    @Override
    public void insertCreditCard(CreditCard card) {
        this.creditCards.add(card);
    }

    @Override
    public boolean credit(BigDecimal money) {
        for (CreditCard creditCard : creditCards) {
            boolean creditSuccess = creditCard.credit(money);
            if (creditSuccess) {
                return creditSuccess;
            }
        }
        return false;
    }

    @Override
    public CreditCard removeCreditCard() {
        return this.creditCards.poll();
    }

}
